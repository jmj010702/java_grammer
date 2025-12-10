package C01Basic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class C09Array {
    public static void main(String[] args) throws IOException {

//       java의 배열은 반드시 사전에 길이가 결정되어야함

//      배열 표현식 1. 배열 선언 후 값 할당 방식
//        int[] arr1 = new int[5];
//        arr1[1] = 10;
////        int배열의 경우 선언시 기본적으로 0으로 초기화 boolean은 false로 초기화, 참조자료형은 null로 초기화;
//        arr1[5] = 60; //index out of bounds 오류 발생
////        배열 표현식 2. 리터럴 방식
//        int[] arr2 = {10, 2, 3, 4, 5};
//
////        배열 표현식 3. 명시적 배열 생성 방식 : 배열을 다른 메서드의 메개변수로 사용할 경우
//        int[] arr3 = new int[]{1, 2, 3, 4, 5};
//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[5]);
//        myList.add(new int[]{1, 2, 3, 4, 5});
//        myList.add({10,2,3,4,5}); //사용불가 (배열인지 아닌지 확인 불가)


//        85,65,90으로 구성된 int 배열을  선언하고 총합과 평균을 구하시오
//        int[] arr = new int[]{85,65,90};
//        int sum =0;
//        double avg =0;
//        for(int i=0; i<arr.length; i++) {
//            sum += arr[i];
//        }
//        avg = (double)sum/arr.length;
//        System.out.println(sum+ " "+avg);
//    }
//

//        배열의 최대값, 최소값;
//        int[] arr = {10,20,30,12,8,17};
////        최대값을 구할 때는 가장 작은 값을 설정;
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for(int i : arr) {
//            if(i>max) {
//                max = i;
//            }
//            if(i<min) {
//                min =i;
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);
////        최소값을 구할 때는 가장 큰 값을 설정;

//        배열의 자리 바꾸기
//        int[] arr = {2,1,3};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;

//        배열 뒤집기  //나중에 클래스에서 원시자료형은 항상 문제가 생김
//
        int[] arr = {10,20,30,40,50};
        int[] arr2 = new int[arr.length];
//        for(int i=0; i<arr.length; i++) {
//            arr2[i]= arr[arr.length-(i+1)];
//        }
//        for(int a : arr2) {
//            System.out.println(a);
//        }

        for(int)
    }}


