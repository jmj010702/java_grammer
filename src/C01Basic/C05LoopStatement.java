package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C05LoopStatement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        while문의 조건식에 변화를 주지 않으면 while 문은 기본적으로 무한 루프
//        int a = 0;
////        아래 while문은 10번 반복되는 반복문
//        while (a < 10) {
//            System.out.print("hello" + a + "\n");
//            a += 1;
//        }

//     break 키워드를 통해 가장 가까이에 있는 반복문을 즉시 종료
//        int c = 2;
//        while (true) {
//            System.out.println(c);
//            c++;
//            if (c > 10) {
//                break;
//            }
//        }
//      반복되는 도어락키 예제
//        만약 비밀번호를 맞추면 즉시 종료. 5회입력을 초과할때 까지 맞추지 못하면 종료
//        비밀번호 5회초과 종료
//        String answer = "1234";
//        int n = 5;
//
//        while (n-- > 0) {
//            String as = br.readLine();
//            if (as.equals(answer)) {
//                System.out.print("정답");
//                break;
//            }
//            System.out.print("비밀번호 5회 초과");
//        }
//
//      입력한 숫자의 구구단 단수 출력 ) @ * @ = @ \n;
//        while(true) {
//
//            int a = Integer.parseInt(br.readLine());
//            int b =1;
//            while(b<10) {
//                System.out.println(a + " * " + b + " = " + a*b );
//                b++;
//            }
//        }

//        do while 문은 무조건 1번은 실행되는 while문

//         for문은 초기식, 조건식, 증감식이 모두 포함돼 있는 반복문이다
//        for(int i=1;i<=10; i++) {
//            if(i%2 != 0)   System.out.print(i+"\n");
//        }
//      continue는 코드의 가독성과 직관성을 위해 사용됨. 필수는 x
//      continue 반복문의 증강, 조건식으로 이동하는 명령어. 즉 continue 하위의 코드를 더이상 실행하지 않음
        for(int i=1;i<=10; i++) {
            if(i%2 == 0) continue;
            System.out.print(i+"\n");
        }

    }
}
