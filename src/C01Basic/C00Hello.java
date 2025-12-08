package C01Basic;
//클래스의 명명 규칙
//1. 반드시 public class명과 파일명이 일치해야 함
//2. 일반적으로 대문자알파벳으로 시작
public class C00Hello {
    //1. main메서드는 자바파일 실행시 실행의 시작점이자, 가장 먼저 실행되는 메서드
    //2. public static void : 어디에서든 접근 가능하고, 반환 또는 리턴값이 없는 메소드
    //3. 메소드명,변수명은 일반적으로 소문자 알파벳으로 시작

    //main 단축어 main
    public static void main(String[] args) {

        //print 단축어 : sout
        System.out.println("hello world"); //반드시 세미콜론으로 명령문 종료

        //메서드를 호츨할때는 메서드명()를 통해 호출
        System.out.println(abc(1));
    }
//  //는 컴파일 대상에서 제외처리하는 주석이다

    /*
    여러줄의 주석처리를 이와 같은 방법으로
    깔끔하게 주석처리하는 것도 가능
     */

    //직접 생성한 리턴값이 있는 메서드 예시
    public static int abc(int a) {
        int c = a+10;
    return c;
    }
}
