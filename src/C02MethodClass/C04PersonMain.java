package C02MethodClass;

import java.io.IOException;

public class C04PersonMain {
    public static void main(String[] args) throws IOException {
        /*
//        회원가입 예시
        String name1 = "홍길동";
        String email1 = "hong1@naver.com";
        int age1 = 30;
        C04PersonMain.printmember(name1,email1,age1);

        String name2 = "홍길동2";
        String email2 = "hong2@naver.com";
        int age2 = 30;
        C04PersonMain.printmember(name2,email2,age2);
        C04PersonMain p2 = new C04PersonMain();
        p2.printmember1(name2,email2,age2);
//       위 코드는  요소(속성)들이 그룹화되어있지 않다보니, 중복과 코드의 가독성이 저하


//        클래스에 속성을 정의하여, 사람 객체로 생성
        C04Person p1 = new C04Person();
        p1.name = "홍길동1";
        p1.email = "hong1@naver.com";
        p1.age = 30;

        C04Person p2 = new C04Person();
        p2.name = "홍길동2";
        p2.email = "hong2@naver.com";
        p2.age = 40;

        printmember2(p1);
        printmember2(p2);

//        위 코드의 문제점
//        1. person객체의 변수에 외부 클래스에 접근 가능
//        2. person에 대한 출력 코드가 외부 클래스마다 중복되어 들어갈 여지가 있다
*/
        C04Person p3 = new C04Person();
        p3.setName("hong1");
        p3.setEmail("hong1@naver.com");
        p3.setAge(30);
        printmember2(p3);
        System.out.println(p3.returnPersonImfo());




    }

//  사용자 정보 출력 메서드 (printmember)
//    ex) 이름은 xx , 이메일은 yy , 나이는 zz 입니다
    public static void printmember(String a, String b, int c) {
        System.out.println("이름은: " + a+ " 이메일은 : "+ b+ " 나이는 : " + c + "입니다.");
    }

    public void printmember1(String a, String b, int c) {
        System.out.println("이름은: " + a+ " 이메일은 : "+ b+ " 나이는 : " + c + "입니다.");
    }
    public static void printmember2(C04Person person) { //객체의 힙메모리 +주소값이 매개변수로 전달

//      private떄문에 직접 접근 못함
//        System.out.println("이름은: " + person.name + " 이메일은 : "+ person.email+ " 나이는 : " + person.age + "입니다.");
//      접근을 못하기 때문에 person클래스에 getter,setter 메서드를 만들어서 세팅하고 값을 가져올 수 있는 메서드를 만듬
//        이렇게 하는게 관례
        System.out.println("이름은: " + person.getName() + " 이메일은 : "+ person.getEmail()+ " 나이는 : " + person.getAge() + "입니다.");
    }
}
