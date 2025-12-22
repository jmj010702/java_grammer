package C05AnonyMousLamda;

import java.io.IOException;
//내부클래스 : 클래스 안에 클래스
//1) static 내부 클래스
//2) 익명 내부 클래스
public class C01InnerClass {
    public static void main(String[] args) throws IOException {
//        static 내부 클래스를 활용한 내부 객체 생성
        Member.MemberInner m1 = new Member.MemberInner(20);
        System.out.println(m1.getB());
    }
}


class Member{
    private int a;

    public int getA() {
        return  this.a;
    }

    public Member(int a) {
        this.a = a;
    }

//    static 내부 클래스 : Member에 static변수처럼 활용
//    실전에서는 별로 안쓰임
    static class MemberInner {
        private int b;

        public int getB() {
            return this.b;
        }

        public MemberInner(int b) {
            this.b = b;
        }
    }
}
