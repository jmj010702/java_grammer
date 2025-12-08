package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C01InputOutput {
    public static void main(String[] args) throws IOException {
        //출력 : System.out을 통해 콘솔 출력
       // System.out.println(20);
        //println은 줄바꿈 있는 출력
        // 2. 입 출력은 모두 문자열로 진행
        //print는 줄바꿈이 없는 출력
//        System.out.print("123123");
//        System.out.print("123123");
        //일벽 1: scanner 클래스 - 입력을 위한 클래스로서 바이트단위 입력처리
        //System.in은 키보드 입력을 뜻함
//        Scanner /*객체변수명*/ sc = new Scanner(System.in);
//        String input = sc.nextLine(); //입력받은 데이터를 한줄로 읽어서. string으로 리턴
//        System.out.println();
//        System.out.print("사용자 입력사항 "  + input);

        //입력 2 : BufferReader 버퍼를  활용하여 더 좋은 성늘 
        //3. 바이트대신 문자단위로 출력
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //아래와 같이 입력값이 주어졌을 때 처리 방법
       /* 1
        gasd
        asd
        ad
        dsad
        1*/
//        Scanner sc1 = new Scanner(System.in);
//        String sta= sc1.nextLine();
//        //입력받은 문자열을 직접 형변환(추천방식)
//         int input1 = Integer.parseInt(sc.nextLine());
//         int input2 = sc.nextInt();


         //입력값 : asd  asd  asd as dasd
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String as = br.readLine();
//       String[] aa =  as.split(" ");
//        System.out.println(aa[0]);
//        System.out.println(aa[1]);
//        System.out.println(aa[2]);
//        //close는 메모리 회수 코드 외부 입출력 장치와 연계된 코드 이므로
//        //GC(가비지컬렉터)의 대상이 아님
//        br.close();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
//       StringTokenizer를 통해 공백을 기준으로 문자열을 하나씩 잘라서 토큰화
        String a = st.nextToken();
        String b = st.nextToken();
        String c = st.nextToken();
        System.out.println(a +" "+ b+ " " + c);
        br.close();

    }

}

