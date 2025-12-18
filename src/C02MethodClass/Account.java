package C02MethodClass;
/*
public class Account {
    private String name;
    private String accountnumber;
    private long balance;

    public Account(String name, String accountnumber, Long balance) {
        this.name = name;
        this.accountnumber = accountnumber;
        this.balance = balance;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public long getBalance() {
        return balance;
    }

    public String  AccountInfo() {
        return this.name + this.accountnumber + this.balance;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", accountnumber='" + accountnumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}


class Account {
    /// * ************ 개선(3) : static를 활용하여 id값을 세팅 & wrapper class 사용 ************ //
    // 실제로는 rdb에서 auto increment 해줌. java에서 만들어주는게 X
    // 생성자가 객체 생성시마다 생성자가 호출되므로, staticId를 생성자에서 ++해주면 됨(auto increment)
    // 단, 세팅이 안될 때 id는 원시자료형 int라 초기값이 0인데 이는 서비스 성격에 맞지 않음(null이 적합)
    // 따라서 wrapper class를 사용하여 참조자료형으로 변환해줘야한다. (참조자료형 초기값은 null)
    private Long id;
    private static long staticId;
    private String name;
    private String accountNumber;
    private long balance; // balance의 경우 초기값 0이 더 적합하기 때문에 원시자료형 long 그대로 사용

    // 생성자(메서드오버라이딩)
    public Account(String name, String accountNumber, long balance) {
        staticId++;
        this.id = staticId;
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //기본생성자
    public Account() {

    }

    // getter
    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    //setter
    //📍 setBalance보다는 의도를 명확히 한 메서드명 사용을 권장
    public void setBalance(long balance) {
        this.balance = balance;
    }

    /// * ************ 개선(1) : 의도를 명확히 한 메서드 생성  ************ //
    // 요구사항 : 송금할 객체에 잔고가 있는지 체크 -> 송금할 객체에서 돈을 차감 -> 송금받을 객체에 돈을 가산
    // 매개변수 : 송금할 객체, 송금 받을 객체, 송금액 -> 이 때, this로 둘게 없으므로 static으로 설계하는게 맞다
    // 하지만 static은 안쓰므로 받을 객체만 넣어야함
    // 최종 매개변수 : 받을 객체, 송금액
    // 최종 요구사항 : 잔고 체크 -> 송금할 객체에서 돈을 차감(this) -> 송금 받을 객체에 돈을 가산(targetAccount)
    public void transfer(Account targetAccount, long money) {
        if (money > this.balance) {
            System.out.println("잔고가 부족합니다.");
            return;
        }
        this.balance = this.balance - money;
        targetAccount.balance = targetAccount.balance + money;
        System.out.println("이체가 완료되었습니다. 남은 잔액 : " + this.balance + "원");
    }

    // cf) static으로 설계 -> 객체지향언어라서 이 설계는 사실 적합하지 않음
    public static void transfer(Account transferAccount, Account targetAccount, long money) {
        transferAccount.balance-=money;
        targetAccount.balance+=money;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
    }
    */