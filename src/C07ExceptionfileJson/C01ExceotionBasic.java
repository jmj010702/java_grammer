package C07ExceptionfileJson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C01ExceotionBasic {
    public static void main(String[] args) throws IOException {
        System.out.println("나눗셈 프로구럄입닌다");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("분자를 입력ㅎ주새요ㅛ");
//        예외처리 기본 : 예외가 발생할 것으로 예상되는 코드를 try로 감싼다.
//        예외처리 목적 : 1) 사용자에게 적절한 에러 메세지 전달
//                      2)예외 발생시 디버깅을 위한 로그 기록
//        에러가 날걸로 예상이 되는 코드들을 try문안에 삽입
        try {
            int head = Integer.parseInt(br.readLine());
            System.out.println("분모를 입력해주셍");
            int tail = Integer.parseInt(br.readLine());
            int resuit = head/tail;
            System.out.println(resuit + "입니다");
//          catch를 통해 에상되는 예외클래스를 분기처리한다.
        } catch (ArithmeticException error) {
//            사용자에게 메세지 전달(가정)
            System.out.println("0으로 나누시면 안됩니다");
//            시스템에 디버깅을 위한 로그 자세히 기록
             error.printStackTrace();

        } catch (NumberFormatException e) {
            System.out.println("문자를 입력하시면 안됩니다");
            e.printStackTrace();
//            Exception은 모든 예외 클래스의 조상 클래스. 구체적인 예외클래스가 catch부에 있다면, 해당 부분으로 우선 분기처리
        } catch (Exception e) {
            System.out.println("예상치 못한 에러가 발생했습니다.");
            e.printStackTrace();
        } finally {
            System.out.println("예외가 발생하든 안하든 무조건 실행되는 구문");
        }
//얘외처리를 하지 않을 경우 프로그램은 강제 종료, 예외처리를 할 경우 프로그램은 에외가 발생하더라도 프로그램은 지속됨
        System.out.println("예외 발생하더라도 예외 처리를 한 후애 살향돠눈 코드");
    }
}
