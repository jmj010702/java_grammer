package C09NetWorking;

import java.io.IOException;
import java.sql.*;

// java -> db 자바와 디비를 연결해 Crud기능을 할 수있게 만드는 도구들
//1. jdbc 2.mybatis 3. jpa
public class C03DBConnect {
    public static void main(String[] args) throws IOException, SQLException {
//        mysql드라이버 별도 다운로드 및 추가
        String url = "jdbc:mysql://localhost:3306/board?useSSL=false"; //SSL = 보안을 위한 기술
//        DB계정
        String userName = "root";
        String passWord = "test1234";

//        username,password를 정확하게 입력해야 됨 아니면 정보가 틀려 로그인이 안됨
        Connection myConnection = DriverManager.getConnection(url, userName, passWord);
        System.out.println(myConnection);

//        Statement객체에 쿼리를 담아 db에 전송
        Statement st = myConnection.createStatement();
        ResultSet result = st.executeQuery("SELECT  * FROM post where id = " );
//      next를 통해 데이터를 1행씩 read
        while (result.next()) {
            System.out.println(result.getInt("id"));
            System.out.println(result.getString("title"));
            System.out.println(result.getString("contents"));
        }


    }
}
