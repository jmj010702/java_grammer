package C04Interface;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01InterfaceMain {
    public static void main(String[] args) throws IOException {
        C01Cat c1 = new C01Cat();
        c1.makesound();
        C01Dog d1 = new C01Dog();
        d1.makesound();

//        인터페이스 특징1 - 다향성 : 하나의 부모타입로 여러 자식 객체를 다룰 수 있음
        C01AnimalInterface1 c2 = new C01Cat();
        c2.makesound();
        C01AnimalInterface1 d2 = new C01Dog();
        d2.makesound();
//        다형성의 장점 : 기존의 구현채를 다른 구현체로 변경시켜도 아무 문제가 없다
//      List<Integer> list = new ArrayList<>():
              List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.get(10);

//        인터페이스 특징: 다중구현(상속) 가능

        C01AnimalInterface1 c3 = new C01Cat();
        c3.makesound();
        C01AnimalInterface2 c4 = new C01Cat();
        c4.eat("츄르");

//        다중 구현의 예시 - List와 queue
        List<Integer> list1 = new LinkedList<>();
//        list1.get(0); // 사용 가능ㅣ
        Queue<Integer> list2 = new LinkedList<>();
//        list2.get(0); //사용 불가

    }
}
