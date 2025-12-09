package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C04IfStatements {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        도어락키 예제
//        String answer = "1234";
//        String as = br.readLine();
//        String as = br.readLine();
//        if(as.equals("1234")) {
//            System.out.println("문이열렸");
//        } else {
//            System.out.println("문이 안열림");
//        }
//
//        교통카드 문제
//        System.out.print("현재 가지고 있는돈은 얼마인가 ");
////        사용자가 가지고 있는 돈을 int로 입력 받는다
////        10000이상이면 택시타시오
////        10000미만 3000이상이면 버스
////        3000원 미만이면 걸어가
//        int m = Integer.parseInt(br.readLine());
//      if, else if 구문에서 조건식은 택 1, 즉 한 조건에 해당하면 실행 후 구문 밖으로 빠져나감
//        if(m>=10000) {
//            System.out.print("택시");
//        } else if (m >= 3000) {
//            System.out.print("버스 ");
//        } else {
//            System.out.print("뚜벅이");
//        }
//      if문을 독립적으로 따로 두고 싶은 경우에는 정확한 범위 지정을 통해 if문이 중복되어 실행되지 않도록 해야 함
//      삼항 연산자 :  결과값 = 조건식 ? 반환값1 : 반환값2
//        String answer = "1234";
//        String as = br.readLine();
//        String  rs = as.equals(answer)? "참" : "거짓";
//        System.out.println(rs);

//      switch 문 : if, else , else if둥  여러 조건문을 가독성 있게 표현한 구문이다.
//        default는 그외의 의미로서 else와 같은 의미
//        int m = Integer.parseInt(br.readLine());
//        switch (m) {
//            case 1:
//                System.out.print("대출");
//                break;
//
//            case 2:
//                System.out.print("에금0");
//                break;
//
//                case 3:
//                    System.out.print("적금");
//                    break;
//
//            default:
//                System.out.print("잘못됨");
//                break;
//        }

    }
}
