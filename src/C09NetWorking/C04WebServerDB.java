package C09NetWorking;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.sql.*;

public class C04WebServerDB {

    public static void main(String[] args) throws IOException, SQLException {
//        사용자 : 크롬을 통해 http://localhost:8080?id=1 get 요청
//        서버 : Db에서 조회한 결과값을 문자열형식으로 응답 1)일반 문자열 2)json
        ServerSocket serverSocket = new ServerSocket(8080);

        String url = "jdbc:mysql://localhost:3306/board?useSSL=false"; //SSL = 보안을 위한 기술
        String userName = "root";
        String passWord = "test1234";
        Connection myConnection = DriverManager.getConnection(url, userName, passWord);
        Statement st = myConnection.createStatement();

        System.out.println("서버 시작");
        System.out.println(serverSocket);
        while (true) {
            Socket socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            StringBuffer sb = new StringBuffer();
            String line = br.readLine();
            while (line != null && !line.isEmpty()) {
                sb.append(line).append("\n");
                line = br.readLine();
            }
            String request = sb.toString();
            String firstline = request.split("\n")[0];
            String infos = firstline.split(" ")[1];
            String id = "";
            if (infos.contains("?")) {
                id = infos.split("=")[1];
            }
            ObjectMapper o1 = new ObjectMapper();


//              id 양옆에 "\'" 를 넣어주는게 룰
            Post p1 = null;
            ResultSet result = st.executeQuery("SELECT  * FROM post where id = " + "\'" + id + "\'");
            while (result.next()) {
//                response += (" id : ") + result.getInt("id");
//                response += (" title : ") + result.getString("title");
//                response += (" contents : ") + result.getString("contents");

               p1 =  new Post(result.getLong("id"), result.getString("title"),result.getString("contents"));
            }
            String jsonpost = o1.writeValueAsString(p1);
            System.out.println(jsonpost);
            String response = "HTTP/1.1 200 OK\r\n" + "content-type: application/json; charset=UTF-8" + "\r\n\r\n" + jsonpost;

            System.out.println(response);

            socket.getOutputStream().write(response.getBytes(StandardCharsets.UTF_8));
            socket.getOutputStream().flush();
            socket.close();


        }


    }

}

class Post {
    private long id;
    private String title;
    private String contents;

    public Post(long id, String title, String contents) {
        this.id = id;
        this.title = title;
        this.contents = contents;
    }

    public Post() {

    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                '}';
    }
}

