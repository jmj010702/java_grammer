package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C06LoopstatementAdvance {
    public static void main(String[] args) throws IOException {
//        1부터 20까지 짝수의 총합 출력
//        int sum =0;
//        for(int i=1; i<=20; i++) {
//            if(i%2 ==0) {
//                sum+=i;
//            } else {
//                continue;
//            }
//        } System.out.print(sum);

//        두수의 최대 공약수 찾기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //   StringTokenizer st = new StringTokenizer(br.readLine());
//        int a = Integer.parseInt(st.nextToken());
//        int b =Integer.parseInt(st.nextToken());
//
//       int sum = a>b ? b : a;
////       sum= Math.min(a,b)
//           int rs= 0;
//        for(int i =1; i<=sum; i++) {
//            if(a%i ==0 && b%i ==0) {
//                if(rs<i) {
//                    System.out.println(rs+"첫");
//                    rs =i;
//                    System.out.println(rs+"늦");
//                }
//            }
//        }
//        for(int i=sum; i>0; i--) {
//            if(a%i ==0 && b%i ==0) {
//                rs = i;
//                break;
//            }
//        }
//        System.out.println(rs);

//        소수인지 여부 판별  소수란 1과 자신을 제외한 숫자로 나누어지지 않는 수 (1보더 큰수)
//        for문을  n번 돌리는게 아닌 아래처럼 i의 제곱만큼만 비교해야 시간초과가 안남
//        i<= Math.sqrt(n)  ==  i*i<=n;
        int n = Integer.parseInt(br.readLine());
        boolean tf = true;
        for(int i =2; i*i<=n; i++) {
            if(n%i == 0) {
                tf = false;
                break;
            } else {
                tf = true;
            }
        }
        if(tf && n!=1) {
            System.out.print("소수 ");
        } else {
            System.out.print("소수아님 ");
        }


//        향상된 for문을 통한 배열 접근 방식
//        for(int i : arr)
//        int[] arr = {1,3,5,7};
////        일반 for문을 통한 저장된  배열 값 변경
//            for(int i=0; i<arr.length; i++) {
//                arr[i] += 10;
//            }
//        System.out.print(Arrays.toString(arr));
//
////            향상된 for문을 통한 arr의 저장된 값 출력; -> 원본의 값 변경
//                for(int i : arr)
//                    System.out.print(i);

//                참조형 변수(객체타입)는 기본적으로 변수를 통한 출력시에 메모리값이 출력
//                  내장된 메서드를 통해 힙 메모리안의  객체값을 보기좋게 출력할 수 있음
//              스택 영역 : 지역변수, 매개변수, 기본형 자료, 객체의 주소값 등을 저장
//              힙 영역 : 애플리케이션 실행 동안 생성되는 모든 클래스 인스턴스와 배열을 저장하는 곳(객체의 실제값)
//              메소드 영역 : 빌드되어 만들어진 소스코드(클래스 등), 정적 변수(static)등이 저장되어 코드 전역에서 사용 가능한 공간
//
//              int a = 10;
//              String[] arr = {"ab","an")
//              arr은 힙메모리주소값을 스택에서 가지고 있다. 실제값은 힙에 저장되어있음
//              a는 스택의 주소값을 가지고 있으며 실제 값(10)은 스택에 가지고 있다

//              하위 영역의 블록(중괄호)에서 정의된 변수는 상위 블록에서 접근 불가
//              for문은 사용헀던 변수명을 for문이 끝난 이후에 또다른 for문에서 재사용 가능
//
//              다중 for문
//        2~9단까지 모든 구구단 한번에 출력
//         2단입니다. 출력 2~~
//        3단입니다 출력 3~~

//        for(int i=2; i<10; i++) {
//            System.out.println(i+"단 입니다.");
//            for(int j=1; j<10; j++) {
//                System.out.println(i + " * "+ j + " = " + i*j);
//            }
//        }


//        라벨문: 반복문에 이름을 붙이는 것
//        loop1 :
//        for(int i~) {
//            for(int j~ ) {
//                //원하는 for문을 labeling을 통해 break 또는 continue 시킬수 있음
//
//                break loop1; //이렇게 하면 바깥 for문이 정지됨
//            }
//        }
























    }
}
