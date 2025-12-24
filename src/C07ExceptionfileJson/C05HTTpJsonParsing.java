package C07ExceptionfileJson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class C05HTTpJsonParsing {
    public static void main(String[] args) throws IOException, InterruptedException {
//        외부에서 데이터를 받아 java의 객체로 변환
//        외부 Api요청을 하기 위한 라이브러리 :  HTTPClient.(java 내장 클래스) RestTemplate, RestClient는 스프링에서 가장 많이 사용하는 클래스
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/posts/1")).GET().build();



//      request에 들어있는 URL로 HTTP 요청(Get Post)등을 전송하고 서버가 보낸 응답 중 Body를 문자열로 변환해서 repponse 객체에 저장
       HttpResponse<String > response =  client.send(request, HttpResponse.BodyHandlers.ofString());
//      서버가 보낸 HTTp 응답의 Body를 문자열 형태로 꺼내서 data 변수에 저장 (파싱은 아직 안된 상태)
       String data = response.body(); //data 안에는 {"userId":1,"id":1,"title":"...","body":"..."} 이런 형태로 저장하지만 타입은 String
//        System.out.println(data);
//        java를 json으로 , json이면 java로 바꿔주는 역할/ 파서 +변환기 역할
        ObjectMapper o1 = new ObjectMapper();
//      Jackson이 data문자열을 json문법으로 해석 -> {} 구조를 분석 ->post 클래스 필드오 키를 매칭 그후 Post객체 생성한 후에 값 주입
//        여기서 Json파싱을 하고 객체 매핑이 실제로 일어남
        Post p1 = o1.readValue(data, Post.class);
        System.out.println(p1);

//        readValue -> Json 에서 java로
//        writeValueAsString -> java를 Json으로

//     JSON 배열을 List<Post>로 변환하는 코드
        JsonNode jsonNodes = o1.readTree(data);
        List<Post> postList = new ArrayList<>();
        for(JsonNode j : jsonNodes) {
            Post p2 = o1.readValue(j.toString(), Post.class);
            postList.add(p2);
        }

//        String result = o1.writeValueAsString(data); //o1.writeValueAsString(data) -> 자바 객체 data를 Json문자열로 직렬화
    }
}
class Post {
    private long userId;
    private long id;
    private String title;
    private String body;

    public Post(long userId, Long id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public Post () {}

    public Long getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}