package C02MethodClass;

import java.io.IOException;

public class C01Method {
    public static void main(String[] args) throws IOException {
        /*
//        for문을 활용해 1~10까지 total값 구하여 출력
        int total =0;
        for(int i =0; i< 11; i++) {
            total +=i;
        }
        System.out.println(total);

        //        for문을 활용해 1~20까지 total값 구하여 출력
        int total2 =0;
        for(int i =0; i<=20; i++) {
            total2 +=i;
        }
        System.out.println(total2);
        */

//      위 코드의 중복이 지속적으로 발생된면, 반복을 피하기 위해 코드의 기능을 모듈(메서드)화 하여 별도로 분리
//       메서드 기본호출방식(static의 유무로도 구분 가능) : 클래스명.메서드명() static 붙음 또는 객체명.메서드명() static 안 붙음;
        System.out.println(C01Method.gettotal(30,40));
//       같은 클래스내에서 정의된 클래스메서드의 호출은 클래스명 생략 가능
        System.out.println(gettotal(10,20));


    }

//    접근제어자(public),  클래스 메서드(static)/ 객체메서드(static x), 반환 타입(int, String, 배열, void 등), 매개변수(input값)
    public static int gettotal(int start, int end) {
        int total = 0;
        for (int i = start; i <= end; i++) {
            total += i;
        }
        return total;
    }

}
