package C01Basic;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.math.BigDecimal;

public class C02Variable {
    //변수의 명명 규칙
//    변수명에 의미의 분절이 일어나는 경우에는 camelcase 또는 _ 사용
    public static void main(String[] args) throws IOException {
        System.out.println(cc());
        /*String my_First_name = "hongildong";
        String my_second_name = "hongildong";*/

    }

//기본형 변수 : byte(1byte), int(4byte), long(8byte), bool, null
//            byte= -128 ~ 127까지
//자료형이 표현할 수 있는 범위를 넘어선 경우 오버플로우/언더플로우 발생
// byte  a = 127; 한 후 a++로 증가시키면 오버플로우가 나버림
// 반대일 경우에 언더플로우

//참조형 변수 : String,
//long l1 = 1;
//long은 명시적으로 L을 붙혀서 해당 타입이 Long타입임을 명시
//public static long l2 = 2L;

    //실수 : float, double
    //   float a = 1.123F;
    //  double b = 1.123;

    //실수 연산은 기본적으로 오차발생:  소수점을 2진법으로 표현하는 부동 소수점을 사용하기 떄문
//미세한 오차는 소수점 절삭을 통하여 당장에는 드러나지 않음.
//부동 소수점 오차 테스트
    public static double aa() {
        double total = 0;
        for (int i = 0; i < 1000; i++) {
            total += 0.1;
        }
        System.out.print(total);
        return total;
    }

//소수점 연산 오차 해결방법1 : 소수를 정수로 변환 후 추후 다시 소수로 변환

    public static double bb() {
        double total2 = 0;
        for (int i = 0; i < 1000; i++) {
            total2 += (0.1 * 10);
        }
        System.out.print(total2 / 10);
        return total2;
    }

    //소수점 연산 오차 해결방법 2: BigDecimal class 사용
    public static double cc() {
        double a1 = 1.03;
        double a2 = 0.42;
        System.out.println(a1 - a2);
//값을 입력받아 저장할 때 부터 문자로 입력을 받아 오차 문제를 해결
// 나중에는  연산 값을 DB에 저장함
        String qwe = "1.03";
        BigDecimal b1 = new BigDecimal(qwe);
        BigDecimal b2 = new BigDecimal("0.42");

        double rs = b1.subtract(b2).doubleValue();
        return rs;
    }
//    문자열 : char -> 한글자 String은 한글자 이상
    char c1 = '가';
    String s1= "가";
}
//String 또는 char배열 최초 선언 시 초기값이 null이 할당
String[] strrarr = new String[][10];

//null은 값이 없다는 의미로서 하나의 타입
String st1 = ""; //빈문자열이 할당
String  st2 = null; //null이 할당 . st2는 더이상 String이 아님
System.out.print(st1);

//타입변환 : (기본방향) 작은 타입에서 큰타입으로의 변환은 문제없이 변환
//int -> long; : 문제 없음
//int -> double : 문제 없음
//double -> int : 기본적으로는 허용 불가, 명시적 형 변환은 가능.

//정수 나누기 정수일 경우 소수점 절사 문제 발생
//두 수가 모두 정수이면 결과값도 정수일 것이라고 java가 판단
//둘 수중에 하나를 double 로 변환시켜 해결
int a = 1;
int b = 4;
double rs = a/b;
double aa = (double)a/b;
System.out.print(rs);

char -> int 문제없음 -> 아스키 코드값으로 변환되서 상관없음
char c1 = 'a'
inr i1 = (int)c1;
int i2 = c1;
//ex)문자비교를 위한 묵시적 타입변환

//문제) 알파벳 소문자 개수 세기

