package C02MethodClass;

import java.io.IOException;

//재귀함수 대표적인 기본 예시 : 누적 합계 , 팩토리얼, 피보나치 수열 등 -> 모두 재귀로 푸는 것을 권고하지 않음
public class C12RecursiveExample {
    public static void main(String[] args) throws IOException {
//        1~10까지 누적합계(for문 활용)
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

//        1~10까지 누적합계 (재귀함수)
        //System.out.println(sumAcc(1, 10));

//        1~5까지 누적 곱
        int sum1 =1;
        for(int i =1; i<6; i++) {
            sum1 *=i;
        }
//        System.out.println(sum1);

//        1~5까지 누적곱 (factorial)
        int total = factorial( 5);
//        System.out.println(total);

//        피보나치 수열
//        1 1 2 3 5 8 13 21 34 ....
//        피보나치 수열의 10번째 값은?
//        풀이 1 : 기본 for문
        int n1 =1;
        int n2 =1;
        int n3 =0;
        for(int i =2; i<10; i++) {
            n3 = n1 +n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(n3);

//        풀이 2 : dp알고리즘 (기억하기-메모리제이션 알고리즘)
        int[] total1 = new int[11];
//점화식 : f(n) = f(n-1) + f(n-2)
        total1[0] = 1;
        total1[1] = 1;
        total1[2] = 1;
        for(int i =3; i<=10; i++) {
            total1[i] = total1[i-1]+total1[i-2];
        }
        System.out.println(total1[10]);

//        풀이법 3  . 재귀함수를 이용한 풀이법(직관적이긴 하나 시간초과가 날 수 있음)

        System.out.println(fibonacchi(10));

    }

    public static int sumAcc(int start, int end) {
//        if (start < end) {
////        리천하기 전에
//            return start + sumAcc(start + 1, end);
//        } else return start;
//    }
        if (start > end) {
            return 0;
        }
        return start + sumAcc(start+1, end);
    }

    public static int factorial(int n) {
        if(n ==1) {
            return 1;
        }
        return n* factorial(n-1);
    }

    public static int fibonacchi(int n ) {
        if(n<=2) {
            return 1;
        }
        return fibonacchi(n-1) + fibonacchi(n-2);
    }

}
