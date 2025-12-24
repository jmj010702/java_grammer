package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Service service = new Service();

        while(true) {
            String s = br.readLine();
            System.out.println("1번 : 회원가입, 2번 : 회원상세조회, 3번 : 회원목록조회, 4번 : 로그인");

            if(s.equals(1)) {
                System.out.println("회원가입서비스입니다.");
                System.out.println("이름을 입력해주세요");
                String name = br.readLine();
                System.out.println("이메일을 입력해주새ㅐ요");
                String email = br.readLine();
                System.out.println("비밀번호를 입력해주세요");
                String pw = br.readLine();
                if (pw.length()<=5) {
                    System.out.println("너무 짧습니다");
                    return;
                }
                try {
                    service.Register(name,email,pw);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }






            }




        }







    }
}
