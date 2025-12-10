package C01Basic;

import java.io.IOException;
import java.util.regex.Pattern;

public class C08String {
    public static void main(String[] args) throws IOException {
//        string 선언 방법
//        객체 선언 방식
//        String st1 = new String("test");
//        String st2 = new String("test");
////        리터럴방식  : String pool을 사용하는 방식(자바에서 추천)
//        String st3 = "hello";
//        String st4 = "hello";

//       참조자료형의 비교는 ==을 지양
//         .equals 는 힙 메모리에 문자열을 가져와서 비교

//            String st1 = "hello";
//            String st2 = "Hello";
//        System.out.print(st1.equals(st2)); //false
//        System.out.print(st1.equalsIgnoreCase(st2)); //true
//
//       문자열의 길이 출력
//        String st1 = "hello word java";
//        System.out.println(st1.length());
//        charAt(n) : 특정 인덱스의 문자(char)값 리턴
//        char c1 = st1.charAt(7);
//        System.out.println(c1);
//        int count = 0;
//        for(int i =0; i<st1.length(); i++) {
////            String st2 = String.valueOf(st1.charAt(i));
////            if(st2.equals("a")) {
//              if(st1.charAt(i) == 'a')
//                count ++;
//
//        }
//        System.out.println(count);
//        tocharArray : String문자열을 char배열로 변환;
//        for(char i: st1.toCharArray()) {
//            if(i == 'a') count++;
//        }
//        indexof(문자열) : 특정 문자열의 위치(index)를 반환, 가장 먼저 나오는 문자열의 위치 변환
//            String st1 = "hello java java";
//        System.out.println(st1.indexOf("java"));
//        System.out.println(st1.lastIndexOf("java"));
//        System.out.println(st1.contains("java")); //true
//        System.out.println(st1.contains("world")); //false

//        문자열 더하기 : +=사용, 성능 측면에서는 추후에 배울 StringBuffer, StringBuilder 사용
//        String st1 = "hello";
//        st1 += "world";
//        st1+= '1'; // String에 char를 더하면 String으로 변환
//        System.out.println(st1);

//          프로그래머스 - 플랫폼 사용범(나머지 구하기)
//          프로그래머스 - 특정문자제거하기

//        .substring(a,b) : a이상 b미만의 index의 문자를 잘라 문자열로 반환
//        String st1 = "hello world";
//        System.out.println(st1.substring(0,5));  //hello
//        System.out.println(st1.substring(6,st1.length())); //world

//        프로그래머스 -> 가운데 글자 가져오기

//        trim, strip : 문자열 양쪽 끝의 공백 제거
//        String st1 = " hello world ";
//        String st2 = st1.trim();
//        System.out.println(st2);
//        String st3 = st1.strip();
//        System.out.println(st3);

//        toupperCase : 모든 문자열을 대문자로 변환
//        tolowerCase : 모든 문자열을 소문자로 변환
//          String st1 = "HELLO";
//            String st2 = "hello";
//            String st3 = st1.toLowerCase();
//            String st4 = st2.toUpperCase();
//        System.out.println(st3+ " " + st4);

//        replace(a,b) : a문자열을 b문자열로 대체
//        String st1 = "hello world";
//        String st2 = st1.replace("world","java");
//        System.out.println(st2);

//        replaceAll(a,b) : replace와 사용법 동일, 정규표현식 쓸 수 있는 점이 차이점
//        String  st1 = "01abC    1234한글123";
////        한글제거 [가-힣]
//        String answer1 = st1.replaceAll("[]가-힣]","");
//        System.out.println(answer1);
////      영어 소문자 제거 [a-z] , 대문자 [A-Z]
//        String answer2 = st1.replaceAll("[a-z]","");
//        System.out.println(answer2);
////      영어 제거  [A-Za-z]
//        String answer3 = st1.replaceAll("[A-za-z]","");
//        System.out.println(answer3);
////      공백제거
//        String answer4 = st1.replaceAll(" ","");
//        System.out.println(answer4);
////      성능 좋은 공백제거
//        String answer5 = st1.replaceAll("\\s+","");
//        System.out.println(answer5);

//          전화번호 검증
//            String num = "010-2222-2222";
//            boolean chk = num.matches("^\\d{3}-\\d{4}-\\d{4}$");
//        System.out.println(chk);

//        이메일 검즘
//            String email = "asd@naver.com";
//        boolean chk = Pattern.matches("^[a-z0-9]+@[a-z]+.com$",email);
//        System.out.println(chk);
//

//         split : 특정 문자를 기준으로 잘라서 문자배열로 만드는것
//        String a = "a:b:c:d";
//        String[] arr = a.split(":");
//
//        String b = "a b c  d";
//        String[] arr2 = b.split(" ");
//        String[] arr3 = b.split("\\s+");
//        System.out.println(arr3.length);
//

//          null과 공백의 차이
//        String s1 = null; //null은 문자열 아님
//        String s2 = ""; // 빈 문자열은 문자열
//        String s3 = " "; // 공백도 문자열
//        System.out.println(s1==s2); // false
//        System.out.println(s2.isEmpty()); //true
////        System.out.println(s1.isEmpty()); // nullpointerException 발생
//        System.out.println(s3.isEmpty()); //false
//        System.out.println(s3.isBlank()); //true

//        공백의 개수 세기
//        int count =0;
//        String abc = "helo  world   java";
//        for(int i=0; i<abc.length(); i++) {
//            if(abc.substring(i,i+1).isBlank() ) {
//                count++;
//            }
//        }
//        System.out.println(count);

//        문자열 조립 : StringBuilder , StringBuffer

//        String[] arr = {"java", "python", "javascript"};
//        StringBuffer stb = new StringBuffer();
//        StringBuilder sb = new StringBuilder();
//        String result = "";
//        for(String i : arr) {
//            stb.append(i).append("\n");
//        }stb.insert(1, "C++");// 문자열 중간에 insert하는 것은 성능을 증가시킨다
//        stb.deleteCharAt(0) ; // 마지막 index를 삭제하는 것 외에는 성능저하 발생
//        result = stb.toString();
//        stb.deleteCharAt(stb.length()-1);
//        System.out.println(result);

//        sb는 성능이 뛰어나지만 동시성 문제 있음(thread-safe하지 않음)
//         ex)쓰레드 A가 append("helli")를 하고 쓰레드 b가 apppend("world")
//        이 두 작업이 섞여 "helworldli" 이런식으로 잘못된 값을 만들 수 있음

//        문자열 뒤집기
//        StringBuilder sb = new StringBuilder();
//            String st1 = "hello";
//            for(int i = st1.length()-1; i>=0; i--) {
//                sb.append(st1.charAt(i));
//            }
//        System.out.println(sb);
//
////            reverse 방식
//            StringBuilder sb3 = new StringBuilder(st1);
//            sb3.reverse();
//        System.out.println(sb3);

//        프로그래머스 - 문자열 밀기

//          문자열비교
        String st1 = "hello";
        String st2 = "dello";
        String st3 = "hello";
        String st4 = "hfllo";
        System.out.println(st1.compareTo(st2)); //양수  st1-st2 아스키코드값으로 뺴기 진행
        System.out.println(st2.compareTo(st1)); //음수
        System.out.println(st1.compareTo(st3)); //0
        System.out.println(st4.compareTo(st3)); //양수 첫 인덱스가 같으면 두번쨰 인덱스로 넘어감




































































































    }
}
