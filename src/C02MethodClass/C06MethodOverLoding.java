package C02MethodClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
// java에서 같은 이름의 메서드 선언은 불가능
//다만 같은 이름의 메서드명을 사용하되, 매개변수의 개수, 또는
//매개변수의 타입이 달라지는 메서드 오버로딩은 허용

public class C06MethodOverLoding {

    public static void main(String[] args) throws IOException {

//        메서드 오버로딩 후 해당 메서드 호출
        System.out.println(sum(10,20));
        System.out.println(sum(10.5,20.5));
        System.out.println(sum(10,20, 30));

//        또다른 메서드 오버로딩 사례
        System.out.println("hello");
        System.out.println(10);
        System.out.println(10.5);
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(0,10);

    }
public static int sum(int a, int b) {
        return a+b;
}
public static int sum(int a, int b ,int c) {
        return a+b+c;
}
    public static double sum(double a, double b) {
        return a+b;
    }
}
