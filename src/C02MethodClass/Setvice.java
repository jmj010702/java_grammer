package C02MethodClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
/*
public class Setvice {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Map<String, Setviceaccount> map = new HashMap<>();

        while (true) {
            System.out.println("사용하실 서비스의 번호를 입력하세요.\n1:계좌 개설, 2: 계좌 조회, 3: 입금, 4: 출금, 5:송금");

            int n = Integer.parseInt(br.readLine());

            if (n == 1) {
                System.out.println("계좌 개설 서비스입니다. 이름, 계좌번호, 금액을 입력하세요");
                st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String accountnum = st.nextToken();
                Long bal = Long.parseLong(st.nextToken());

                if (map.containsKey(accountnum)) {
                    System.out.println("이미 등록된 계좌 번호 입니다");
                } else {
                    map.put(accountnum, new Setviceaccount(name, accountnum, bal));
                    System.out.println("계좌 개설이 완료되었습니다.");
                }

            } else if (n == 2) {
                System.out.println("계좌 조회 서비스입니다. 계좌번호를 입력해주세요");
                String accountNum = br.readLine();
                Setviceaccount s1 = map.get(accountNum);
                if (map.containsKey(accountNum)) {
                    System.out.println("이름 " + s1.getname() + " 계좌정보 : " + s1.getaccountNum() + " 잔액 " + s1.getbalance());
                } else {
                    System.out.println("없는 계좌 번호입니다.");
                }
            } else if (n == 3) {
                System.out.println("계좌 입금 서비스입니다. 계좌번호를 입력해주세요");
                String accountNum = br.readLine();
                Setviceaccount s1 = map.get(accountNum);
                if (map.containsKey(accountNum)) {
                    System.out.println("금액을 작성해주세요");
                    Long money = Long.parseLong(br.readLine());
                    s1.plus(money);
                    System.out.println("입금이 완료되었습니다");
                } else {
                    System.out.println("없는 계좌번호 입니다.");
                    return;
                }

            } else if (n == 4) {
                System.out.println("계좌 출금 서비스입니다. 계좌번호를 입력해주세요");
                String accountNum = br.readLine();
                Setviceaccount s1 = map.get(accountNum);
                if (map.containsKey(accountNum)) {
                    System.out.println("금액을 작성해주세요");
                    Long money = Long.parseLong(br.readLine());
                    if (s1.tf(money)) {
                        s1.minus(money);
                        System.out.println("출금이 완료되었습니다");
                    } else {
                        System.out.println("잔액이 부족합니다");
                    }
                    } else {
                    System.out.println("없는 계좌번호 입니다.");
                    return;
                }
            } else if(n ==5) {
                System.out.println("계좌 출금 서비스입니다. 본인 계좌번호를 입력해주세요");
                String accountNum = br.readLine();
                Setviceaccount s1 = map.get(accountNum);
                System.out.println("계좌 출금 서비스입니다. 상대 계좌번호를 입력해주세요");
                String targetNum = br.readLine();
                Setviceaccount s2 = map.get(accountNum);
                System.out.println("금액을 작성해주세요");
                Long money = Long.parseLong(br.readLine());
                if (s1.tf(money)) {
                    s1.transfer(s2, money);
                    System.out.println("송금이 완료되었습니다");
                }
            }
        }
    }
}
    class Setviceaccount {
        private Long id;
        private static Long auto_id;
        private String name;
        private String accountNum;
        private Long balance;

        public Setviceaccount(String name, String accountNum, Long balance) {
            auto_id++;
            this.id = auto_id;
            this.name = name;
            this.accountNum = accountNum;
            this.balance = balance;
        }

        public String getname() {
            return name;
        }

        public String getaccountNum() {
            return accountNum;
        }

        public Long getbalance() {
            return balance;
        }

        public void plus(Long money) {
            this.balance += money;
        }

        public void minus(Long money) {
            this.balance -= money;
        }

        public boolean tf(long money) {
            if (this.balance < money) {
                return false;
            } else {
                return true;
            }
        }

        public void transfer(Setviceaccount targetacc, Long money) {
            if(this.balance < money) {
                return;
            } else {
                this.balance -=money;
                targetacc.balance += money;
            }
        }

        @Override
        public String toString() {
            return "{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", accountNum='" + accountNum + '\'' +
                    ", balance=" + balance +
                    '}';
        }
    }

*/