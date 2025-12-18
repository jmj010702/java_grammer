package C02MethodClass;
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//1.회원가입
//2.글쓴다
//3.회원에 방금 쓴 글을 add 한다
//        4.회원 상세 조회 -> author.getpostList().size


TODO <게시판서비스>
1.계좌객체 : Author, Post
2.자료구조 : List(authorList, postList)
3.서비스 기능 : 사용하실 서비스 번호를 입력해주세요
    3-1.회원가입 : 이름, 이메일, 비밀번호, id값(auto_increment)
    3-2.회원 전체 목록 조회 : id, email
    3-3.회원 상세 조회(id로 조회 -> email로 조회) : id, email, name, password, 작성글수(postList에서 조회하거나, author객체에서 postList목록을 변수로 갖는것도 가능)
    3-4.게시글 작성 : id, title, contents, 작성자Email(직접 Author 객체를 변수로 갖는것도 가능)
    3-5.게시물 목록 조회 : id(post), title
    3-6.게시물 상세 조회(게시글 id로 조회) : id, title, contents, 작성자이름

public class C10BoardServic {
    public static void main(String[] args) throws IOException {
        List<Author> authorList = new ArrayList<>();
        List<Post> postList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("사용하실 서비스 번호를 입력해주세요\n" + "1.회원가입, " + "2.회원 전체 목록 조회, " + "3.회원 상세 조회, " + "4.게시글 작성, " + "5.게시물 목록 조회, " + "6.게시물 상세 조회");
            int num = Integer.parseInt(br.readLine());

            if (num == 1) {
                System.out.println("회원가입 서비스입니다.");
                System.out.println("이름을 입력하세요.");
                String userName = br.readLine();
                System.out.println("이메일을 입력하세요.");
                String userEmail = br.readLine();
                System.out.println("비밀번호를 입력하세요.");
                String userPw = br.readLine();
                //이름, 이메일, 비밀번호, id값(auto_increment)
                Author author = new Author(userName, userEmail, userPw);
                if (true) { //TODO 검증 코드 추가
                    authorList.add(author);
                    System.out.println("회원가입이 완료되었습니다.");
                } else {
                    System.out.println("해당 이메일로 이미 가입된 계정입니다.");
                }

            } else if (num == 2) {
                System.out.println("회원 전체 목록 조회 서비스입니다.");
                for (Author a : authorList) {
                    System.out.println("id:" + a.getId() + ", user_email: " + a.getUserEmail());
                }

            } else if (num == 3) {
                System.out.println("회원 상세 조회 서비스입니다.");
                // id, email, name, password, 작성글수(postList에서 조회하거나, author객체에서 postList목록을 변수로 갖는것도 가능)
                System.out.println("조회할 회원의 아이디를 입력하세요.");
                Long id = Long.parseLong(br.readLine());
                Author author = null;
                for (Author a : authorList) {
                    if (a.getId() == id) {
                        author = a;
                        break;
                    }
                }
                System.out.println(" id : " + author.getId() +
                        " email : " + author.getUserEmail() + " name " +
                        author.getUseName() + " password " +
                        author.getUserPw() + " 작성글 수 " +
                        author.getPostList().size());

            }
            if (num == 4) {
                System.out.println("게시글 작성 서비스입니다.");
                System.out.println("작성자의 email을 입력하세요.");
                String email = br.readLine();
                Author author = null;
                for (Author a : authorList) {
                    if (a.getUserEmail().equals(email)) {
                        author = a;
                        break;
                    }
                }
                System.out.println("제목을 입력하세요.");
                String title = br.readLine();
                System.out.println("내용을 입력하세요.");
                String contents = br.readLine();
                Post post = new Post(title, contents, author);
                postList.add(post);
//                author.getPostList().add(post);
            } else if (num == 5) {
                System.out.println("게시물 목록 조회 서비스입니다.");
                for (Post p : postList) {
                    System.out.println("id:" + p.getId() + ", title : " + p.getTitle());
                }
            } else if (num == 6) {
                System.out.println("게시물 상세 조회 서비스입니다.");
                // id, title, contents, 작성자이름(게시글 id로 조회)
                System.out.println("조회할 게시글  ID를 입력하세요.");
                Long id = Long.parseLong(br.readLine());
                Post post = null;
                for (Post p : postList) {
                    if (p.getId() == id) {
                        post = p;
                        break;
                    }
                }
                System.out.println("id " + post.getId() + " title " + post.getTitle() +
                        "contents : " + post.getContents() + " 작성자 이름 : " +
                        post.getAuthor().getUseName());
            }
        }
    }


}



class Author {
    private Long id;
    private static long staticId;
    private String useName;
    private String userEmail;
    private String userPw;
    private List<Post> postList; // 작성자 별 post 리스트를 담고있음

    // 기본생성자
    public Author() {

    }

    // 생성자
    public Author(String useName, String userEmail, String userPw) {
        staticId++;
        this.id = staticId;
        this.useName = useName;
        this.userEmail = userEmail;
        this.userPw = userPw;
        this.postList = new ArrayList<>();
    }

    //getter
    public Long getId() {
        return id;
    }

    public String getUseName() {
        return useName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPw() {
        return userPw;
    }

    public List<Post> getPostList() {
        return postList;
    }

}

//        id, title, contents, 작성자Email(직접 Author 객체를 변수로 갖는것도 가능)
class Post {
    private Long id;
    private static long staticId;
    private String title;
    private String contents;
    private Author author; // 게시글 별 작성자 리스트
    // 기본생성자
    public Post() {

    }

    // 생성자
    public Post(String title, String contents, Author author) {
        staticId++;
        this.id = staticId;
        this.title = title;
        this.contents = contents;
       this.author = author;
       author.getPostList().add(this);
    }

    // getter
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }


    public Author getAuthor() {

        return this.author;
    }
}*/