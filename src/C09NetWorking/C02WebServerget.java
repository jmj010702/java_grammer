package C09NetWorking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class C02WebServerget {

    public static void main(String[] args) throws IOException {
//        사용자 : 크롬을 통해 http://localhost:8080?id=1 get 요청
//        서버 : "hello world java" + id 문자열을 응답
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("서버 시작");
        System.out.println(serverSocket);
        while (true) {
            Socket socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            StringBuffer sb = new StringBuffer();
            String  line = br.readLine();
            while (line != null && !line.isEmpty()) {
                sb.append(line).append("\n");
                line = br.readLine();
            }
            String request = sb.toString();
            String  firstline = request.split("\n")[0];
            String infos = firstline.split( " ")[1];
            String id = "";
            if(infos.contains("?")) {
                id = infos.split("=")[1];
            }
            System.out.println(id);
            String response = "HTTP/1.1 200 OK\r\n\r\n" + "hello world test " + id;
            socket.getOutputStream().write(response.getBytes(StandardCharsets.UTF_8));
            socket.getOutputStream().flush();
            socket.close();


        }


    }

}
