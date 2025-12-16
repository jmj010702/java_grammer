package C02MethodClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class C03Class {
    public static void main(String[] args) throws IOException {
/*
//   클래스 메서드의 기본 호출 방식
        int rs =  Calculator.sum(10,20);
        System.out.println(rs);

//       객체가 아닌  클래스 사용의 문제점 : 고유의 변수, 고유의 메서드 사용 불가
//        a부서의 매출 발생
//        20원 매출 발생
Calculator.sumAcc(20);
//        30원 매출 발생
Calculator.sumAcc(30);
//        40원 매출 발생
//        누적매출 : 90원
        System.out.println(Calculator.sumAcc(40));

        //        B부서의 매출
//      10원 매출
        System.out.println(Calculator.sumAcc(10));  //100 -> 10이 되어야 함
//      20원 매출
        System.out.println(Calculator.sumAcc(20));  //120 -> 30이 되어야 함
        */

//        객체를 활용한 부서별 매출 계산
//        객체 생성 방법 : 클래스명 객체명 = new 클래스명();
        CalculatorForInstance cala = new CalculatorForInstance();
        cala.sumAcc(20);
        cala.sumAcc(30);
        cala.sumAcc(40);
        System.out.println(cala.total);

        CalculatorForInstance calb = new CalculatorForInstance();
        calb.sumAcc(20);
        calb.sumAcc(30);
        calb.sumAcc(20);
        System.out.println(calb.total);

//      클래스 메서드 사용 예시
        System.out.println(Math.max(10, 20));
//        깩체사용 예시
        List<Integer> list = new ArrayList<>();
        list.add(10);

    }

}

class Calculator {
    //    전역변수 선언할 때 static이 붙으면 클래스 변수 없으면 객체 변수
    static int total = 0;

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sumAcc(int a) {
        total += a;
        return total;
    }
}

class CalculatorForInstance {
    // 객체 변수
    int total = 0;

    //   메서드에 static이 있는 경우는 클래스 메서드
//   클래스 메서드는 일반적으로 객체의 상태와 상관없는 독입적인 로직 수행시에 사용
//    클래스 메서드 호출시 : 클래스명.메서드명();
    public static int sum(int a, int b) {
        return a + b;
    }

    //    메서드에 static이 없는 경우는 객체 메서드
//    객체 메서드 호출시 : 객체명.메서드명();
    public int sumAcc(int a) {
//       this는 객체 자기 자신을 의미함
//        this는 객체를 지칭
//        일반적으로 매개변수와 객체변수 이름을 구분짓기 위해 사용
        this.total += a;
        return this.total;
    }
}