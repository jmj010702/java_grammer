package C01Basic;

import com.sun.source.tree.ArrayAccessTree;

import java.io.IOException;
import java.util.*;

public class C09Array {
    public static void main(String[] args) throws IOException {

//       java의 배열은 반드시 사전에 길이가 결정되어야함

//      배열 표현식 1. 배열 선언 후 값 할당 방식
//        int[] arr1 = new int[5];
//        arr1[1] = 10;
//        int배열의 경우 선언시 기본적으로 0으로 초기화 boolean은 false로 초기화, 참조자료형은 null로 초기화;
//        arr1[5] = 60; //index out of bounds 오류 발생
//        배열 표현식 2. 리터럴 방식
//        int[] arr2 = {10, 2, 3, 4, 5};
//
//        배열 표현식 3. 명시적 배열 생성 방식 : 배열을 다른 메서드의 메개변수로 사용할 경우
//        int[] arr3 = new int[]{1, 2, 3, 4, 5};
//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[5]);
//        myList.add(new int[]{1, 2, 3, 4, 5});
//        myList안에 담긴 형태는 { {1,2,3,4,5} } 이런식으로 담김  또 담은경우에는 { {1,2,3,4,5} , {6,7,8,9}   } 이런식으로 담기는데  list.get([0][0] 또는 [1][0] } 이런식으로 호출해야됨
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
//        최대값을 구할 때는 가장 작은 값을 설정;
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
//        최소값을 구할 때는 가장 큰 값을 설정;

//        배열의 자리 바꾸기
//        int[] arr = {2,1,3};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;

//        배열 뒤집기  //나중에 클래스에서 원시자료형은 항상 문제가 생김
//
//        int[] arr = {10,20,30,40,50};
//        int[] arr2 = new int[arr.length];
//        for(int i=0; i<arr.length; i++) {
//            arr2[i]= arr[arr.length-(i+1)];
//        }
//        for(int a : arr2) {
//            System.out.println(a);
//        }
//
//        뒤에서부터 점근하는 방식
//        int index =0;
//        for(int i=arr.length-1; i>=0; i--) {
//            arr2[index]= arr[i];
//            index++;
//        }
//        for(int a : arr2) {
//            System.out.println(a);
//        }

//        배열의 정렬
//        String[] strarr = {"abc", "aaa", "acb", "abb"};
//        Arrays.sort(strarr); //기본이 오름차순  Arrays는 클래스 메서드 strarr은 객체 메서드
//
////        System.out.println(Arrays.toString(strarr));
//
//        Arrays.sort(strarr, Comparator.reverseOrder()); // 내림차순 메서드
//        System.out.println(Arrays.toString(strarr));

//        int[] arr = {17,12,20,10,15};
//        Integer[] arr1 = {17,12,20,10,15};
//        Arrays.sort(arr);
//        System.out.println( Arrays.toString(arr));
//        Arrays.sort(arr, Comparator.reverseOrder());  //원시자료형은 Comparator 사용불가능
//        Arrays.sort(arr1, Comparator.reverseOrder());
//        System.out.println( Arrays.toString(arr1));

//        배열 선택정렬 알고리즘 오름차순
//      1.2중 for문을 사용하여 index마다 최소값 찾기
//      2.현재위치와 자리 변경
//        int[] arr = {17, 12, 20, 10, 15};
//        int index = 0;
//        int temp = 0;
//        for (int i = 0; i < arr.length; i++) {
//            int min = Integer.MAX_VALUE;
//            index = i; //최소값 인덱스
//            for (int j = i; j < arr.length; j++) { //i=현재 자리
//                temp = arr[i]; //첫자리 수
//                if (min > arr[j]) {
//                    min = arr[j];//최소값
//                    arr[i] = min;
//                    arr[j] = temp;
//
//                }
//            }
//
//            System.out.println("과정"+i+ Arrays.toString(arr));
//
//        }
//            System.out.println(Arrays.toString(arr));

//                내림차순 정렬 알고리즘
//                int[] arr = {17,12,20,10,15};
//                int index =0;
//                int temp =0;
//                for(int i=0; i<arr.length; i++) {
//                    int min = Integer.MIN_VALUE;
//                    temp = arr[i]; //첫자리 수
//                    index = i; //최소값 인덱스
//                    for(int j=i; j<arr.length; j++) { //i=현재 자리
//                        temp = arr[i]; //첫자리 수
//                        if(min<arr[j]) {
//                            min = arr[j];//최소값
//                            arr[i] = min;
//                            arr[j] = temp;
//                        }
//            }
//            }
//        System.out.println(Arrays.toString(arr));
//        }

//        오름차순 방법 2
//        int[] arr = {17, 12, 20, 10, 15};
//
//        int temp = 0;
//        for (int i = 0; i < arr.length; i++) {
//            int min = arr[i];
//            int index = i; //최소값 인덱스
//            for (int j = i+1; j<arr.length; j++) { //i=현재 자리
//                if (min > arr[j]) {
//                    min = arr[j];//최소값
//                    index = j;
//                }
//            }
//             temp = arr[i];
//             arr[i] = arr[index];
//             arr[index] = temp;
//            System.out.println("과정"+i+ Arrays.toString(arr));
//        }
//        System.out.println(Arrays.toString(arr));


//      오름차순 방법 3
//        int[] arr = {17, 12, 20, 10, 15};
//
//        for(int i=0; i<arr.length; i++) {
//            for(int j =i; j<arr.length; j++) {
//                if(arr[i]>arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//                System.out.println(Arrays.toString(arr));
//            }
//        }
//        System.out.println(Arrays.toString(arr));

//      알고리즘 복잡도
//      전체 순회할 경우 o(n) //한번에 찾으면 o(n1)
//       위에 선택정령 알고리즘 복잡도는 o(n^2);
//      java 기본 내장 정렬함수의 복잡도는 o(n*log(n)) 압도적으로 성능이 좋음
//       수학 log(1000)일경우  => 3  1000은 10의 3승이므로  3 /
//        컴퓨터일 경우에는  n을 보통 2 제곱으로 놓기 떄문에 2의 승만큼 임

//        조합문제 :  모두 각기 다른 숫자의 배열이 있을 때. 만들어질 수 있는 두 숫자의 조합을 출력
//        ex) (10,20),(10,30),(10,40) ......
//        int[] arr = {10, 20,30,40,50};
//        for(int i=0; i<arr.length; i++) {
//            for(int j=i+1; j<arr.length; j++) {
//                    System.out.println(arr[i]+" " +arr[j]);
//            }
//        }
//
//      배열의 중복 제거 : set(중복X, 순서X) 자료구조 활용
//      ex) 10,20,30,40 만 있게 출력해라
//        int[] arr = {10,30,20,30,10,40};
//        Set<Integer> set = new HashSet<>();
//
//        for(int a : arr) {
//            set.add(a);
//        }
//        int[] ans = new int[set.size()];
//        int index =0;
//        for(int a : set) {
//            ans[index] = a;
//            index++;
//        }
//        Arrays.sort(ans);
//        System.out.println(set);
//        System.out.println(Arrays.toString(ans));


//         배열의 검색 복잡도 o(n)
//        int[] arr = {1,3,6,8,9,11,15};
//        int target = 11;
////      target의 인덱스를 찾아라
//        int index = -1;
//        for(int i =0; i<arr.length; i++) {
//            if (target == arr[i]) {
//                index = i;
//                break;
//            }
//        }
//        System.out.println(index); //6

//       이분 탐색(이진 검색) =binary search, 복잡도 log(n)
//      사전에 데이터가 오름차순 정렬돼 있는 경우, 중복된 값이 없는 경우, 이분 탐색 가능
//        int[] arr = {1,3,6,8,8,9,11,15};
//        int target = 11;
//        int index = Arrays.binarySearch(arr, target);
////        찾고자 하는 값이 있으면 해당 인덱스 리턴
////        찾고자 하는 값이 없으면 음수값 리턴
//        int index2 = Arrays.binarySearch(arr, 13);
//        System.out.println(index);
//        System.out.println(index2);

//            배열값 비교
//            int[] arr1= {10,20,30};
//            int[] arr2 = {10,20,30};
//        System.out.println(arr1 == arr2); //false
//        System.out.println(Arrays.equals(arr1, arr2)); // true

//        배열복사
//        Arrays.copyOf(배열명, length),
//        Arrays.copyOfRange(배열명, 시작인덱스, 끝인덱스);
//        int[] arr = {1,4,6,7,8,1,2,4,6};
//        int[] arr1 = Arrays.copyOf(arr, 4);
//        System.out.println(Arrays.toString(arr1));
//        int[] arr2 = Arrays.copyOfRange(arr, 3, 6);
//        System.out.println(Arrays.toString(arr2));


//        Arrays.fill : 배열에 모든값을 변경(채우기)
//        String[] arr = new String[5];
//        for (int i=0; i<arr.length; i++) {
//            arr[i] = "";
//        }
//        Arrays.fill(arr, "");
//

//         배열에서 가로는 행 세로는 열  int[]행 []열
//        2차원 배열의 선언과 값 할당
//        방법 1. 선언 후 할당 방식
//        int[][] arr1 = new int[3][2];
//        arr1[0][0] = 1;
//        arr1[0][1] = 2;
//        arr1[1][0] = 1;
//        arr1[1][1] = 2;
//        arr1[2][0] = 1;
//        arr1[2][1] = 2;
//
////        방법2. 리터럴 방식
//        int[][] arr2 ={ {1,2}, {1,2}, {1,2}};
////        다차원 배열 출력할 때는 Arrays.deepToString

//        [3][4]사이즈의 2차월 배열을 선언하고 1~12 까지 숫자값을 각 배열에 순차적으로 할당
        int num = 1;
        int[][] arr3 = new int[3][4] ;
//        { {1,2,3,4}  {5,6,7,8} {9,10,11,12} }
        for(int i =0; i<arr3.length; i++) {         //행의 길이
            for(int j=0; j<arr3[i].length; j++) { //열의 길이
                arr3[i][j] = num;
                num++;
            }
        }
 //      2차원배열의 출력
//        다차원 배열은 독립적인 배열을 모아둔 것이다 .
        System.out.println(arr3); // 2차원 배열의 힙주소값  출력
        System.out.println(Arrays.toString(arr3)); //각 1차원 배열의 값들을 모아논 힙주소값을 출력
        System.out.println(Arrays.deepToString(arr3)); // 각 1차원 배열의 값들을 출력


//  프로그래머스 -행렬의 덧셈
      /*
        import java.io.IOException;
import java.util.Arrays;

        public class test {
            public static void main(String[] args) throws IOException {
                int[][] arr1 = new int[][] { {1,2},{2,3}};
                int[][] arr2 = new int[][] { {3,4} , {5,6}};

                int[][] answer = new int[arr1.length][arr1[0].length];
                for(int i =0; i<arr1.length; i++) {
                    for(int j=0; j< arr1[i].length; j++) {
                        answer[i][j] = arr1[i][j] + arr2[i][j];
                    }
                }
                System.out.println(Arrays.deepToString(answer));
            }
        }
*/
//          k번째 수
        /*
        import java.io.IOException;
import java.util.Arrays;

        public class test {
            public static void main(String[] args) throws IOException {
                int[] array = {1, 5, 2, 6, 3, 7, 4};
                int[][] commands = {{2, 5, 3},{4, 4,1},{1, 7, 3}};
                int j=0, k=0;
                int index =0;
                int[] answer = new int[commands.length];
                for(int i=0; i<commands.length; i++) {
//            for(int a=0; a<commands[i].length; a++) {
                    j = commands[i][0]-1;
                    k = commands[i][1];
                    index = commands[i][2]-1;
                    int[] arr2 = Arrays.copyOfRange(array, j, k);
                    Arrays.sort(arr2);
                    answer[i] = arr2[index];
                    System.out.println(Arrays.toString(answer));
//            }
                }
                System.out.println(Arrays.toString(answer));

            }
        }

        */

//        가변배열 : 2차원 배열에서 각 1차원의 배열의 길이가 서로 다를 수 있는 배열의 구조
//        int[][] arr1 = { {1,2},{1,2,3},{1,2,3,4}};
//
////       배열 전체길이는 반드시 사전할당 되어야 하지만, 1차원 배열의 길이는 추루 할당 가능
//        int[][] arr2 = new int[3][];
//        arr2[0] = new int[2];
//        arr2[1] = new int[3];
//        arr2[2] = new int[4];

    }
    }

