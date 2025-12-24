package C07ExceptionfileJson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C04Json {
    public static void main(String[] args) throws IOException {
/*
//  외부의 json파일을 java의 클래스(객체)변환      : json 파싱 (역직렬화)
        Path filepath = Paths.get("src/C07ExceptionfileJson/myjson.json");
        String st1 = Files.readString(filepath);
        System.out.println(st1);


//        JackSon 라이브러리(spring엔 기본적으로 탑재, java에서는 별도로 추가)의 objectMapper클래스를 통한 객체로 파싱
        Path filepath = Paths.get("src/C07ExceptionfileJson/myjson.json");
        String st1 = Files.readString(filepath);
        ObjectMapper o1 = new ObjectMapper();
//        map으로 일괄적으로 String, String 으로 파싱
        Map<String, String> m1 = o1.readValue(st1, Map.class);
//        System.out.println(m1.get("name"));
//    내가 직접 만든 객체로 파싱
        student mystudent = o1.readValue(st1, student.class); //st1을 파싱한 후에 mystudent객체에 넣어주는 구조
        System.out.println(mystudent);
        System.out.println(mystudent.getId());
        System.out.println(mystudent.getCity());
//        List형식으로 주어지는 json파싱 : 트리 구조에 JsonNode로 변환
        Path filepath = Paths.get("src/C07ExceptionfileJson/myjson2.json");
        String st1 = Files.readString(filepath);
        ObjectMapper o1 = new ObjectMapper();
        JsonNode Jsonnodes = o1.readTree(st1);
        List<student> studentList = new ArrayList<>();
//        System.out.println(j1);
        for (JsonNode j : Jsonnodes) {
            student s1 = o1.readValue(j.toString(), student.class);
            studentList.add(s1);
        }
        System.out.println(studentList);

//        Json 직렬화 : 객체 -> Json
        student s1 = new student(1L, "h2", "1", "seoul");
        ObjectMapper o1 = new ObjectMapper();
        String result = o1.writeValueAsString(s1);
        System.out.println(s1);
        System.out.println(result);
*/

    }
}

//  실제 값의 세팅은 private변수이므로 직접 접근 불가
//  java에 reflection 기술을 통해 런타임시점에 private변수도 직접 접근 가능.
//다만, field값을 유추할 수 있도록 (getter 메서드+ 기본생성자)를 생성해야함
//클래스를 만들 때 형식(타입)이 딱 맞아야 함
class student {
    private Long id;
    private String name;
    private String classNumber;
    private String city;

    public student(Long id, String name, String city, String classNumber) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.classNumber = classNumber;
    }

    public student() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "{" + "id=" + id + ", name='" + name + '\'' + ", classNumber='" + classNumber + '\'' + ", city='" + city + '\'' + '}';
    }
}
