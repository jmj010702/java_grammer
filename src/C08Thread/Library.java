package C08Thread;

public class Library {
    private  static int bookcount =100;
//   synchronized : 메서드 내에서 1개의 쓰레드만을 실행되도록 보장
//    public synchronized static void borrow() { // 싱크로나이즈
    public static void borrow() {
        if(bookcount>0 ) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            bookcount -=1;
            System.out.println("대출완료");
        } else {
            System.out.println("대출 불가");
        }
    }

    public static int getBookcount() {
        return bookcount;
    }
}
