package C02MethodClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C02Methodpratice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
//      클래스명 생략 가능
        if(/*C02Methodpratice.*/isPrime(n)) {
            System.out.println("입력한 숫자는 소수");
        } else {
            System.out.println("입력한 숫자는 소수가 아님");
        }
    }

//    소수판별기 메서드(isPrime) 생성
//    접근제어자(public), 클래스 메서드, 반환 타입은  boolean, 입력값은 int
     public static boolean isPrime(int a) {
         if (a <= 1) {
//             메서드에서 return을 만나면 메서드가 강제 종료
             return false;
         }
         for (int i = 2; i * i <= a; i++) {
             if (a % i == 0) {
               return   false;
             }
         }
       return true;
     }

     public static void voidMethod() {
        if(true) {
//            void 메서드에서 return은 메서드 강제종료 목적으로 사용
            return;
     }
         System.out.println("hello world");
     }
}
