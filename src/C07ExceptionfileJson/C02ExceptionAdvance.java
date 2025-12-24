package C07ExceptionfileJson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


class C02ExceptionAdvance {
    public static void main(String[] args) {

//      의도된 예외 강제 발생 : 특정 시점에 프로그램을 강제 중지시키기 위한 목적
        Scanner sc = new Scanner(System.in);
        System.out.println("email 입력");
        String email = sc.nextLine();
        System.out.println("pw 입력");
        String name = sc.nextLine();
        try {
//            register(email, name);
        }catch (IllegalArgumentException e) {
            //        위에서 에러가 터지면 main메서드까지 전파되기 때문에 main도 종료
            System.out.println("DB에 저장되는 코드");
e.printStackTrace();
        }
    }}

//      checked exception의 처리방법
//        방법 1. throws를 통해 checked에외처리를 위임받고, main에서도 throws (시스템에 위임)
//      String text =  fileread("src/C07ExceptionfileJson/test.txt");
//        System.out.println(text);

//        방법 2.throws를 통해 checked에외처리를 위임받고,호출하는 쪽애서 예외처리
//        try {
//            String text = fileread("src/C07ExceptionfileJson/test.txt");
//            System.out.println(text);
//        } catch (IOException e) {
////            사용자에게 메시지 전달
//            System.out.println("파일처리 과정에서 에러가 발생 ");
//            e.printStackTrace();
//        }

//        방법 3. checked 예외를 try/catch하여 unchecked 예외 강제 발생 (DB롤백을 목적ㅇ으로 이렇게 처리)
//        try {
//            String text = fileread("src/C07ExceptionfileJson/test.txt");
//            System.out.println(text);
//        } catch (IOException e) {
////            사용자에게 메시지 전달
//throw new RuntimeException( " assad");
//            System.out.println("파일처리 과정에서 에러가 발생 ");
//            e.printStackTrace();
//        }
//    }
//


//    static boolean register(String email, String pw) {
//        if (pw.length() >= 10) {
//            return true;
//        } else {
////            예외를 강제 발생시킴으로서 이 시점에서 해당 메서드 강제 종료
////            예외는 기본적으로 메서드를 호출한 쪽으로 전파
//            throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
//        }
//    }
////    static String fileread(String path) throws IOException {
//
//    static String fileread(String path) {
//        Path filepath = Paths.get(path);
//        String text = null;
//        try {
//            text = Files.readString(filepath);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return text;
//    }
//}


//Controller (사용자와 인터페이스) -> 메서드 호출 -> Service (핵심로직 , DB접근)