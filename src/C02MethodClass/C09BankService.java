package C02MethodClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class C09BankService {
    public static void main(String[] args) throws IOException {

        Map<String, Bankaccount> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            System.out.println("사용하실 서비스의 번호를 입력하세요.\n1:계좌 개설, 2: 계좌 조회, 3: 입금, 4: 출금, 5:송금");
        int n = Integer.parseInt(br.readLine());
            if( n==1) {
//                계좌 개설
                System.out.println("이름, 계좌번호, 잔액을 입력해주세요");
                String a = br.readLine();
                String b= br.readLine();
                long c = Long.parseLong(br.readLine());
                if(map.containsKey(b)) {
                    System.out.println("중복된 계좌번호입니다");
                }else {
                    map.put(b, new Bankaccount(a,b,c));
                }

            } else if(n==2) {
//                계좌 조회
                System.out.println("계좌번호를 입력해주세요ㅕ");
                String a = br.readLine();
                Bankaccount b1 = map.get(a);
                System.out.println("계좌주명 : " + b1.getName()+" 계좌번호 " + b1.getAccountNumber() + " 잔액 " + b1.getBalance());

            } else if (n==3) {
                System.out.println("입금입니다. 계좌번호를 입력해주세요ㅕ");
                String a = br.readLine();
                System.out.println("입금액");
                long money = Long.parseLong(br.readLine());
                Bankaccount b1 = map.get(a);
                System.out.println("입금 전 정보" + "\n" +" 계좌주명 : " + b1.getName() + " 잔액 " + b1.getBalance());
                b1.depasit(money);
                System.out.println("입금 후 정보" + "\n" + "계좌주명 : " + b1.getName() +" 잔액 " + b1.getBalance());

            } else if(n ==4) {
                System.out.println("출금할 계좌번호를 입력해주세요ㅕ");
                String a = br.readLine();
                System.out.println("출금액 ");
                long money = Long.parseLong(br.readLine());
                Bankaccount b1 = map.get(a);
                if (b1.checkBalance(money)) {
                    b1.minus(money);
                    System.out.println("출금 완료");
                } else {
                    System.out.println("잔액 부족 ");
                }

            } else if (n ==5) {
                System.out.println("본인 계좌번호를 입력해주세요ㅕ");
                String a = br.readLine();
                System.out.println("상대 계좌번호를 입력해주세요ㅕ");
                String b = br.readLine();
                System.out.println("송금액 ");
                long money = Long.parseLong(br.readLine());
                Bankaccount b2 = map.get(b);
                Bankaccount b1 = map.get(a);
                if(b1.checkBalance(money)) {
                    b1.trasnsfer(b2,money);
                    System.out.println("송금이 완료되었습니다");

               } else {
                   System.out.println("잔액부족");
               }

            }

        }
    }
}

class  Bankaccount {
    private Long id;
    private static long staticId;
    private String name;
    private String accountNumber;
    private long balance;

    public Bankaccount(String accountNumber, String name, long balance) {
        staticId++;
        this.id = staticId;
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }
    public Bankaccount() {

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public long getBalance() {
        return balance;
    }

    public void depasit(long money) {
        this.balance += money;
    }

    public void minus(long money) {
        this.balance -= money;
    }

    public boolean checkBalance(long money) {
    if( this.balance < money) {
        return false;
    } else {
        return true;
    }
    }
    public void trasnsfer(Bankaccount target, long money) {
        if(this.balance < money) {
            return;
        }
//        여기서 this는 메서드를 사용한 객체
       this.balance -= money;
       target.balance += money;
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