package C09NetWorking;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
//  프로그램을 구분짓는 단위 port


public class C01WebSererGet {
    public static void main(String[] args) throws IOException {
//        사용자 : 크롬을 통해 http://서버url get 요청  (http 요청문서조립 필요(db에서는 데이터를 불러옴))
//        (데이터 없이 요청을 보내면 get 데이터 있이 보낼때는 post( ex ) 회원가입, 로그인) 같이 데이터를 보낼때
//        서버 : "hello world hava" 문자열을 응답 (http응답 문서 조립필요 )

//        소켓이란 서버와 사용자가 통신을 하귀 위한 네트워크 통신의 끝점을 나타내는 개념.
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("서버 시작");
        System.out.println(serverSocket);
        while (true) {
            //        accept : 사용자의 연결 요청을 수락
            //        socket 객체 안에는 사용자가 보내온 http요청문서 및 사용자정보(ip등)이 들어있음
            Socket socket = serverSocket.accept();
            //        정상은 200 오류는 400번대
            String response = "HTTP/1.1 200 OK\r\n\r\n" + "hello world test";
            //        write란 사용자에게 서버의 응답메시지를 전송
            socket.getOutputStream().write(response.getBytes(StandardCharsets.UTF_8));
            //        flush란 일반적으로 변경사항을 확정하는 것을 의미
            socket.getOutputStream().flush();
            //        메모리 낭비를 줄이기 위해 close
            socket.close();


        }


    }
}
