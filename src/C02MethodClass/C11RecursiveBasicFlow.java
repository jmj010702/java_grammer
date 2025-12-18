package C02MethodClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//재귀함수 기본 호출 원리와 과정
public class C11RecursiveBasicFlow {
    public static void main(String[] args) throws IOException {
//        recur0(0,3);
//        recur1(0,3);
        recur2(new ArrayList<>(),0,3);
    }
//    재귀를 멈추는 방법은 return밖에 없음
//    기본자료형 변수의 재귀 함수내 변화 과정
//    매개변수로 넘기는 시점에 값 변경
    public static void recur0(int count, int target) {
        if (count == target) return;
        System.out.println("재귀 호출 전 count : " + count); // 첫 호출 때 0 -> 두번째 호출때 1 -> 세번째 2
        recur0(count + 1, target);
        System.out.println("재귀 호출 후 count : " + count); // 2 (네번째) 0 -> 1 (다섯번째) -> 0(여섯번째)
    }

    //    기본자료형 변수의 재귀 함수내 변화 과정
//      함수내에서 값을 변경
//
    public static void recur1(int count, int target) {
        if (count == target) return;
        System.out.println("재귀 호출 전 count : " + count); // 0 첫번째 -> 1( 두번째 -> 2 (세번째
        count += 1;
        recur1(count, target);
        System.out.println("재귀 호출 후 count : " + count); //3(네번째) -> 2 (다섯번째) ->1 (여섯번째)
    }

//    객체를 매개변수로 활용한 재귀 함수내 변화과정
//    객체는 힙 메모리를 통해 원복 객체가 변경되므로
//    재귀함수간에도 값의 변화를 공유
    public static void recur2(List<Integer> list, int count, int target) {
        if (list.size() == target) return;
    list.add(count);


        recur2(list,count +1, target);
        //리스트는 객체라 각각의 함수에 따른 변수값ㄱ과는 다르게
//        객체의 힘메모리 주소안에 있는 값에 영향을 끼치기 때문에 리스트안에 add한 값은 변하지 않음
        System.out.println(list); // [0] -> [0,1] -> [0,1,2] 쌓일 땐 이렇게 쌓이지만 출력할때는 [0,1,2]로 출력됨
        list.remove(list.size()-1); // 이렇게 하면 담긴 상태 그대로 출력할 수있다. [0,1,2] ->[0,1] -> [0]
    }
}
