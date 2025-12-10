package C01Basic;

import com.sun.jdi.connect.AttachingConnector;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07ReferenceType {
    public static void main(String[] args) throws IOException {

        //기본(원시자료형) : int, char, boolean 등
        //기본 자료형의 특징 : 리터럴(값그대로)방식으로 값 세팅

        //참조자료형 : 기본 자료형을 제외한 클래스 기반의 객체
//          특징 : new 키워드를 통해 값 세팅;

//        String st1 = new String("hello world");
////        String은 예외적으로 리터럴값 세팅 허용
//        String st2 = "hello world";
////       참조 자료형을 출력하면 힙메모리의 주소값이 출력되어야 하나 String 내부에
////        toString메서드가 구현 및 자동호출 되도록 설계
//
////        System.out.print(st1);
//
//        int[] arr = new int[4];
////        배열도 객체이므로 new 키워드를 써야 하나, 예외적으로 리터럴값 세팅 허용
//        int[] arr2 = {1,3,4,5};
////        System.out.print(arr2); -> 힙메모리주소값 출력
////        배열은 tostring 메서드가 별도로 구현되어있기 때문에, 별도로 호출해줘야함;
//        System.out.print(Arrays.toString(arr2));
//
////        원시자료형은 스택메모리에 값이 저장되므로, ==으로 비교시 값자체를 비교
//        int a =10;
//        int b =10;
//        System.out.print((a==b) +"\n");
//
////        참조자료형은 스택 메모리에 힙메모리의 주소값이 저장되므로, ==로 비교시 힙메모리주소값을 비교
//        String st1 = new String("hello");
//        String st2 = new String("hello");
//        System.out.print(st1==st2);
////        별도의 메서드를 통해 힙메모리의 값을 출력
//        System.out.print(st1.equals(st2));
//
//          wrapper class ; 기본형 타입을 wrapping한 클래스 또한 참조자료형
//            int i1 = 10;
//            Integer i2 = 10;
////            wrapper 클래스의 주요 메서드 사용 예시
//            String st1 = Integer.toString(i1);
//            int i3 = Integer.parseInt(st1);
//
//

//             추후 배우게 될 list,map,set 등 참조자료형에는 원시자료형을 쓸 수 없음
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);
////         배열도 객체이므로 new 키워드를 써야 하나, 예외적으로 리터럴값 세팅 허용
////        다만 예외적으로 일반 배열에는 원시 자료형 세팅이 가능
//        int[] arr1 = {10,20,30};

//            int i =10;
////           오토 박싱 : 원시자료형 -> wrapper 클래스 자동 형변환
//            Integer i2 = i;
////        오토 언박싱 : wrapper 클래스 -> 원시 자동 형변환
//            int i3 = i2;



    }
}
