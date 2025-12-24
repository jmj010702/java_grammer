package C08Thread;

public class MyThread extends Thread {
//  thread를 실행 (.start)하면 thread클래스 내에 run메서드 호출
//    그런데 thread클래스의 run메서드는 비어있으므로, 상속받아 오버라이딩
    @Override
    public void run() {
        System.out.println("스레드 실향 ");
    }

}
