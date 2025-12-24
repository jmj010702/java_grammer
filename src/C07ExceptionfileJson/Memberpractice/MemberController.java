package C07ExceptionfileJson.Memberpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.NoSuchElementException;

public class MemberController {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MemberService memberService = new MemberService();

        while (true) {
            System.out.println("1번  회원가입 2번 회원 상세조회 3번 회원 목록조회 4번 로그인 ");
            String num = br.readLine();

            if (num.equals("1")) {
                System.out.println("회원가입입니다");
                System.out.println("이름");
                String name = br.readLine();
                System.out.println("이메일");
                String email = br.readLine();
                System.out.println("비밀번호");
                String pw = br.readLine();

                try {
                    memberService.Register(name, email, pw);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
            } else if (num.equals("2")) {
                System.out.println("회원 상세조회 서비스 ");
                System.out.println("ID 입력");
                long id = Long.parseLong(br.readLine());
                try {
                    MemberEntity member = memberService.findById(id);
                    System.out.println(member);
                } catch (NoSuchElementException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
            } else if (num.equals("3")) {
                System.out.println("회원 전체 목록 조회");
                List<MemberEntity> memberEntities = memberService.findAll();
                System.out.println(memberEntities);
            } else if (num.equals("4")) {
                System.out.println("로그인입니다");
                System.out.println("email");
                String email = br.readLine();
                System.out.println("pw");
                String pw = br.readLine();
                try {

                    memberService.login(email, pw);
                    System.out.println("로그인 성공입니다");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }

            }
        }

    }
}
