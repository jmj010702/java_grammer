package C05AnonyMousLamda;

import java.io.IOException;

//익명 내부클래스
public class C02AnonyMous {
    public static void main(String[] args) throws IOException {
//        AbstractAnimal을 상속한 클래스가 별도로 존재하지 않고,
//        익명클래스가 만들어짐과 동시에 익명객체가 생성.
//        AbstractAnimal aa = new AbstractAnimal() { //오른쪽이 익명의 내부 클래스를 만든 것
//            @Override
//            void makesound() {
//                System.out.println("멍멍");
//            }
//        };
//        aa.eat();
//        aa.makesound();
//
////        구현 클래스가 없는 추상클래스 또는 인터페이스는 익명객체로 생성.
//            Animal1 a1 = new Animal1() {
//            @Override
//            public void makesound() {
//
//            }
//            @Override
//            public void eat() {
//
//            }
//        };

//        인터페이스에 익명객체에 구현해야할 메서드가 한개밖에 없을 때에는 람다표현식(화살표현식) 사용가능
//        Animal2 a2_1 = () /* 왼쪽에 괄호는 매개변수를 담고 전달해주는 역할을 한다 */ ->  {
//            System.out.println("hello world1");
//            System.out.println("hello world2");
//        };
//        a2_1.makesound();

//        실행문이 1줄 밖에 없을때애는 {} 생략 가능
//        Animal2 a2_2 = () /* 왼쪽에 괄호는 매개변수를 담고 전달해주는 역할을 한다 */ -> System.out.println("hello world1");
//        a2_2.makesound();
//
//       매개변수가 있는 익명 객체의 람다함수 생성
//        Animal3 a3_1 = (a,b,c ) -> {
//            return a+" , " + b+  " , " + c;
//        };
//        System.out.println(a3_1.makesound("java","c","python"));
//
//        Animal3 a3_2 = (a,b,c ) -> a+" , " + b+  " , " + c;

//        실습
//      Animal4인터페이스 생성 및 makesound메서드 선언 : 매개변수는 String String int, 리턴 타입은 String
//        익면객체 생성시 메서드의 기능 : 매개변수의 숫자값이 10이상이면 a+b를 리턴 10미만이면 a만 리턴

        Animal4 a4_1 = (a,b,c) -> {
            if(c>=10) {
                return a+ ", " + b;
            } else {
                return a;
            }
        };
Animal4 a4_2 = new Animal4() {
    @Override
    public String makesound(String a, String b, int c) {
        if(c>=10) {
            return a+ ", " + b;
        } else {
            return a;
        }
    }
};

        System.out.println(a4_1.makesound("java", "c++" , 9));

    }
}
//abstract는 객체를 못만듬
abstract class AbstractAnimal{

    abstract void makesound();

    void  eat(){
        System.out.println("먹이를 먹습니다.");
    }

}
interface Animal1{
    void makesound();

    void eat();
}

interface Animal2{
    void makesound();
}
interface Animal3{
    String  makesound(String a,String b,String c);
}

interface  Animal4{
    String makesound(String a,String b, int c);
}
