package C02MethodClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/*
public class C08AcountMain {
    public static void main(String[] args) throws IOException {
//        계좌개설 (객체 생성 )

//        List를 계좌 객체를 담는 자료구조로 사용
        List<Account> list = new ArrayList<>();
        list.add(new Account("hong1", "12345", 100000L));
        list.add(new Account("hong2", "54321", 200000L));
        list.add(new Account("hong3", "13579", 50000L));

//        계좌1(계좌번호 "1234")에서 계좌2(계좌번호 "54321")로 송금 (50000) : 잔고 변경 메서드 필요
//        내 객체를 찾아서 50000을 차감하고 상대방 객체를 찾아서 50000을 가산한다
        for (Account a : list) {
            if (a.getAccountnumber().equals("12345")) {
                System.out.println(a);
                a.setBalance(a.getBalance() - 50000L);
                System.out.println(a.getAccountnumber() + ": " + a.getBalance());
            } else if (a.getAccountnumber().equals("54321")) {
                System.out.println(a);
                a.setBalance(a.getBalance() + 50000);
                System.out.println(a.getAccountnumber() + ": " + a.getBalance());
            }

        }

          Map<String, Account> accountMap = new HashMap<>();
        accountMap.put("12345", new Account("12345", "이지연", 1000000));
        accountMap.put("54321", new Account("54321", "brad", 0));

        Account a = accountMap.get("12345");
        Account b = accountMap.get("54321");

        // 추천
        a.transfer(b, 50000);

        // 비추천
        Account.transfer(a,b,50000);
        System.out.println(accountMap);


    }
}

//AccountClass 생성 - 계좌주명 name / 계좌번호 - accountnumber -String / 잔고 (balance) -long/

 */