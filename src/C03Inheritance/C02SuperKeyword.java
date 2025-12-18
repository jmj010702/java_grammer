package C03Inheritance;

//메서드 오버로딩 : 메서드명이 같지만 매개변수를 다르게한 메서드 생성(이름만 같은 메서드와는 완전 다른 메서드
//메서드 오버라이딩 : 부모메서드를 자식이 재정의

import java.io.IOException;
// 부모클래스를 상속받을 때, 자식 객체의 생성자에서는 부모 객체를 자동으로 생성.
//이 때, 부모클래스에 기본생성자가 없으면, 자식클래스에서 에러발생
public class C02SuperKeyword extends SuperParents {
    int a = 20;

    public C02SuperKeyword() {
//        super(); : 부모클래스의 생성자를 호출하는 메서드
        super(10);
        this.a =10;
    }

    public static void main(String[] args) throws IOException {
        C02SuperKeyword c1 = new C02SuperKeyword();
        c1.display();

    }

    public void display() {
        System.out.println("자식의 변수" + this.a);
//        부모의 변수나 메서드에 접근할때에는 super 키워드 사용
        System.out.println("부모의 변수" + super.a);
    }
}

class SuperParents {
    int a;

    public SuperParents(int a) {
        this.a = a;
    }
}

