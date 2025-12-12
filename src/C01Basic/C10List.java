package C01Basic;

import java.io.IOException;
import java.util.*;
import java.util.stream.LongStream;

public class C10List {
    public static void main(String[] args) throws IOException {
/*
          클래스의 객체 생성방식 : class명 변수명 = new 클래스명();
          객체는 자신만의 고유의 메모리를 가지고 있다
         List는 인터페이스
        List의 클래스 1. ArrayList 2. LinkedList
        List 선언 방법1
        ArrayList<String > myList1 = new ArrayList<String>();
        ArrayList<String > myList2 = new ArrayList<>();

      List선언방법 2 : 가장 일방적인 방법
        List<String > myList3 = new ArrayList<>();

   초기값 세팅 방법1. 개data add
        myList3.add("java");
        myList3.add("c++");
        myList3.add("jpython");
        List의 출력
        List 등의 컬렉션프레임워크 안에는 toString메서드가 구현되있고 , 자동으로 호출된다.
        System.out.println(myList3);

  초기값 세팅방법2 . 배열을 리스트로 변환
        String[] arr = {"java", "python", "c++"};
        arr배열의 모든 값이 myList4 리스트로 들어감
        List<String> myList4 = new ArrayList<>(Arrays.asList(arr));

        System.out.println(myList4);

  List의 안에 자료타입으로는 기본형 타입은 쓸 수 없음
        int[] arr1 = {10,20,30};
        List<Integer> myList5 = new ArrayList<>();
        for(int i : arr1) {
            myList5.add(i);
        }
        Collection<Integer> arr3 = new ArrayList();


//      add : 리스트에 값을 하나씩 추가하는 메서드
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(0, 30); //List는 중간 위치에 데이터를 삽입하고 삭제하는 성능은 비효율적이다.
        System.out.println(list);


//        get(index) : 특정 index의 요소 반환
        System.out.println(list.get(2));

//        size() 리스트의 개수(길이)를 반환
        System.out.println(list.size());

//        List의 값 출력
//        방법1. 일반 for문
        for(int i=0; i< list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
//        방법2. 향상된 for문
        for(int i : list) {
            System.out.print(i+ " ");
        }
        System.out.println();
//        remove : 값 삭제
        List<Integer> list1 = new ArrayList<>();
        for(int i =1; i<4; i++) {
            list1.add(i);
        }
        list1.remove(0);
        list1.remove(list1.size()-1);

        System.out.println(list1);

//      indexOf : 특정값을 찾아 index return (가장 먼저 나오는 값)
        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(30);
        System.out.println(list2.indexOf(30));

//      contains : 값이 있는지 없는 여부를 리턴 (boolean 타입)
        System.out.println(list2.contains(20));


//      프로그래머스 n의 배수 고르기

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
        class Solution {
            public int[] solution(int n, int[] numlist) {

                List<Integer> list = new ArrayList<>();
                for(int i : numlist) {
                    if( i% n == 0) {
                        list.add(i);
                    }
                }
                int[] answer = new int[list.size()];
                int index =0;
                for(int i : list) {
                    answer[index] = i;
                    index++;
                }

                return answer;
            }
        }


//        정렬
//        방법1. Collections 클래스의 sort 메서드 사용 n(log(n))
            List<Integer> list = new ArrayList<>();
            list.add(5);
            list.add(1);
            list.add(2);
            list.add(6);
            list.add(8);
            list.add(4);
            list.add(3);

//      클래스명.메서드(변수) 클래스 메서드
//      변수명.메서드  객체 메서드
        Collections.sort(list); //오름차순
        Collections.sort(list, Comparator.reverseOrder()); //내림차순

        System.out.println(list);

//        방법2. 객체의 sort 메서드 사용  n(log(n))
        list.sort(Comparator.naturalOrder()); //오름차순
        list.sort(Comparator.reverseOrder()); //내림차순
        System.out.println(list);


//      이중리스트 : 리스트 안에 리스트  (2차원 배열과 비슷)
//      l1은  힙에 l1의 값이 들어간 힙 주소값을 가지고 list의 힙 주소값에는 l1의 힙 주소값이 들어가있다 .
//        [[1,2,3], [4,5,6]]
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        list.add(l1); // [[]] //선언된 List안에 List를 생성했을 때는 안에 껍데기를 생성해줘야됨
        list.add(new ArrayList<>()); //[ [], [] ]
//      이중 리스트안에 값을 넣는 2가지 방식
//        방식 1
       l1.add(1);
        l1.add(2);
        l1.add(3); //[ [1,2,3], [] ]
//        방식 2
        list.get(1).add(4);
        list.get(1).add(5);
        list.get(1).add(6); // [ [1,2,3], [4,5,6] ]

        int a =1;
        for(int i = 0; i<2; i++) {
            for (int j =0; j<3; j++) {
             list.get(i).add(a);
             a++;
            }
        }
        System.out.println(list);


//        [ [1,2,3], [4,5,6], [7,8,9] ...[58,59,60 ] 형태에 이중리스트 생성
//        1번째 방식
        List<List<Integer>> list = new ArrayList<>();
        int a = 1;
        for(int i = 0; i<20; i++) {
            list.add(new ArrayList<>());
            for (int j =0; j<3; j++) {
                list.get(i).add(a);
                a++;
            }
        }
        System.out.println(list);

        List<List<Integer>> list = new ArrayList<>();
        int a = 1;
        for(int i = 0; i<20; i++) {
           List<Integer> m1 = new ArrayList<>(); //20번 동안 m1의 list 안에 m1리스트 생성, List안에 List이름은 상관없음
           list.add(m1);
            for (int j =0; j<3; j++) {
                m1.add(a);
                a++;
            }
        }
        System.out.println(list);



//        리스트의 배열
//        [ {10,20} , {1,2,3} , {4,3,2,1} ] 리스트의 배열 안에 값 넣기
        List<Integer[]> list = new ArrayList<>();
//      리스트의 배열 안에 값넣는 방법1
         Integer[]  a   ={10,20};
         Integer[]  b   ={1,2,3};
         Integer[]  c   ={4,3,2,1};
        list.add(a);
        list.add(b);
        list.add(c);

        List<int[]> list1 = new ArrayList<>();

//              리스트의 배열 안에 값넣는 방법2
        list1.add(new int [3]);
        list1.get(1)[0] =1;
        list1.get(1)[1] =2;
        list1.get(1)[2] =3;

        List<int[]> list1 = new ArrayList<>();
//             리스트의 배열 안에 값넣는 방법3 // 이게 제일 편함
        list1.add(new int[] {4,3,2,1});

        for(int i  =0; i< list1.size(); i++) {
            System.out.println(Arrays.toString(list1.get(i))); // 배열 주소값이 출력 [x1배열주소, x2배열주소, x3배열주소 ...]
            System.out.println(list);  // 배열 주소값이 출력 [x1배열주소, x2배열주소, x3배열주소 ...]
        }
*/


    }
}
