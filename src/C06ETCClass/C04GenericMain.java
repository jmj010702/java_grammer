package C06ETCClass;

import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;

public class C04GenericMain {
    public static void main(String[] args) throws IOException {

        String[] strarr = {"java", "python", "C++"};
        stchan(strarr, 0, 1);

        Integer[] intarr = {10, 20, 30};

        allchange(intarr, 0, 2);
        allchange(strarr, 0, 2);
//        System.out.println(Arrays.toString(intarr));
//        System.out.println(Arrays.toString(strarr));

//        제네릭을 사용한 객체 생성
   genericperson<String> p1 = new genericperson<>("hong");
   genericperson<Integer> p2 = new genericperson<>(20);
        System.out.println(p1.getValue());
        System.out.println(p2.getValue());

//  제네릭에 사용 예시
//      큐, 맵, set 등등 참조자료형을 지정해주는 모든 자료구조가 제네릭을 사용함
        List<String > list1 = new ArrayList<>();
        Stream<String > stream;
        Optional<Student> mystudent;

    }

//  제네릭 메서드는 반환타입 왼쪽에 <T>라고 선언
//    이때 T는 참조형 변수인 객체 타입만을 허용
    static <T> void allchange(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void intchan(int[] intarr, int a, int b) {
        int c = intarr[a];
        intarr[a] = intarr[b];
        intarr[b] = c;

    }

    static void stchan(String[] str, int a, int b) {
        String temp = str[a];
        str[a] = str[b];
        str[b] = temp;
    }

}

class genericperson<T> {
    private T value;

    public genericperson(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
