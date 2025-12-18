package C03Inheritance;

import java.io.IOException;

// 상속 : 부모의 변수와 메서드를 자식 클래스에서 물려받는 것. (extends 키워드 사용 )
public class C01Inheritance extends Parents {
    int b = 20;

    public static void main(String[] args) throws IOException {
        C01Inheritance c1 = new C01Inheritance();
//      부모 클래스의 a변수 상속
        System.out.println(c1.a);
        System.out.println(c1.b);

        //        System.out.println(c1.c);

//        부모 클래스의 m1메서드 상속
        c1.m1();
        c1.m2();

    }
//    오버라이딩 ( 부모 메서드의 재정의) : 부모 클래스의 메서드 명과 자식 클래스의 메서드명이 동일한 경우
//Override된 메서드임을 명시적으로 표현하는 키워드(어노테이션). 성능 최적화를 위해서 키워드를 붙여주는 것이 더 좋음
    @Override
    public void m1() {
        System.out.println("부모클래스 메서드를 자식클래스에서 오버라이딩한 m1입니다");
    }

    public void m2() {
        System.out.println("자식 클래스의 메서드입니다.");
    }
}

class Parents {
    int a = 10;
    //    다 상속받는게 아닌 private 접근제어자는 클래스 내부에서만 접근 가능하므로, 자식 클래스에서도 접근 불가
    private int c = 30;

    public void m1() {
        System.out.println("부모 클래스의 메서드입니다.");
    }

}