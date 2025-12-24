package C07ExceptionfileJson;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class C03File {
    public static void main(String[] args) throws IOException {
        /*
//        콘솔창에 키보드를 통한 입출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        System.out.println(in);


//        파일에서 읽기 : IO패키지 -> 성능은 nio보다 조금은 떨어지나 thread blocking을 하기 때문에 treadsafe하다
        BufferedReader br2 = new BufferedReader(new FileReader("src/C07ExceptionfileJson/test.txt"));
        String fileread = br2.readLine();
        while (fileread != null) {
            System.out.println(fileread);
            fileread = br2.readLine();
        }

//        파일에서 읽기  : NIO 패키지 -> IO패키지보다 빠르지만 thread nonblock을 하기 때문에 treadsafe하지 않다
        Path filepath  = Paths.get("src/C07ExceptionfileJson/test.txt");
//        readstring : 문자열 전체를 통채로 read
        String st1 = Files.readString(filepath);
        System.out.println(st1);
//        readAlllines  : 문자열을 라인별로 split하여 list형태로 저장
        List<String> st2 = Files.readAllLines(filepath);
        System.out.println(st2);

//      파일에 문자열 쓰기
        Path filepath  = Paths.get("src/C07ExceptionfileJson/test.txt");
//        Files.write(filepath, "홍길동2".getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE_NEW); // 파일 생성 및 작성
        Files.write(filepath, "홍길동1\n".getBytes(StandardCharsets.UTF_8), StandardOpenOption.WRITE); //덮어쓰기
        Files.write(filepath, "홍길동2\n".getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND); //추가

//          json -> 객체 : 파싱(역직렬화), 객체 -> json : 직렬화

*/




    }
}
