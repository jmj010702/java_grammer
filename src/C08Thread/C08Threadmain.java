package C08Thread;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class C08Threadmain {
    public static void main(String[] args) throws IOException, InterruptedException {
        /*
//   단일 스레드 실행
        for(int i =0; i<1000; i++) {
        Library.borrow();
        }
        System.out.println(Library.getBookcount());

//        스레드
//        방법 1. 스레드 클래스 상속방식
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        Thread t3 = new MyThread();
        Thread t4 = new MyThread();
        Thread t5 = new MyThread();
//        각 스레드는 코드의 실행 순서가ㅏ 보장되지 않는 비동기적 실행(Main에 할당된 thread포함)
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        System.out.println("hello world");

//        방법 2. Runnabble을 구현한 객체를 Thread클래스 생성자에 주입하는 방식
//        구현객체의 run메서드를 Thread객체가 가져다가 사용
//        Thread t1 = new Thread(() -> System.out.println("스레드실행"));
        new Thread(() -> System.out.println("스레드실행")).start();
        new Thread(() -> System.out.println("스레드실행")).start();
        new Thread(() -> System.out.println("스레드실행")).start();
        new Thread(() -> System.out.println("스레드실행")).start();
        new Thread(() -> System.out.println("스레드실행")).start();
        new Thread(() -> System.out.println("스레드실행")).start();

//        멀티스레드 동시성 이슈 테스트
        for(int i =0; i<1000; i++ ) {
            new Thread(() -> Library.borrow()).start();
        }
        Thread.sleep(30000);
        System.out.println(Library.getBookcount());

     //        멀티스레드 동시성 이슈 테스트
        for (int i = 0; i < 1000; i++) {
            Thread t1 = new Thread(() -> Library.borrow());
            t1.start();
//        join : 한 스레드의 작업이 모두 완료될 때까지, 다른 스레드를 생성하지 않는것 -> 사실상 단일스레드처럼 동작하므로, 성능저하
            t1.join();

        }
        Thread.sleep(2000);
        System.out.println(Library.getBookcount());
     */

//        syncronized를 통한 동시성 제어 예시
        StringBuffer sb1 = new StringBuffer();
        sb1.append("hello"); //syncronized 메서드 -> 동시성 제어
        StringBuilder sb2 = new StringBuilder();
        sb2.append("hello"); //일반 메서드 -> 동시성 문제 발생 가능성 있음

        Map<String ,String > map1 = new ConcurrentHashMap<>();
        map1.put("java","자바"); // syncronized 메서드
        Map<String ,String > map = new HashMap<>();
        map.put("java","자바"); //일반 메서드














    }
}
