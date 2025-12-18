
/*package C02MethodClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
1.계좌객체 : Author, Post
2.자료구조 : List(authorList, postList)
3.서비스 기능 : 사용하실 서비스 번호를 입력해주세요
    3-1.회원가입 : 이름, 이메일, 비밀번호, id값(auto_increment)
    3-2.회원 전체 목록 조회 : id, email
    3-3.회원 상세 조회(id로 조회 -> email로 조회) : id, email, name, password, 작성글수(postList에서 조회하거나, author객체에서 postList목록을 변수로 갖는것도 가능)
    3-4.게시글 작성 : id, title, contents, 작성자Email(직접 Author 객체를 변수로 갖는것도 가능)
    3-5.게시물 목록 조회 : id(post), title
    3-6.게시물 상세 조회(게시글 id로 조회) : id, title, contents, 작성자이름


public class Board {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        List<Author> authorList = new ArrayList<>();
        List<Post> postList = new ArrayList<>();

        while (true) {
            System.out.println("사용하실 서비스 번호를 입력해주세요\n" + "1.회원가입, " + "2.회원 전체 목록 조회, " + "3.회원 상세 조회, " + "4.게시글 작성, " + "5.게시물 목록 조회, " + "6.게시물 상세 조회");

             int n = Integer.parseInt(br.readLine());
            if(n ==1) {
                //            3-1.회원가입 : 이름, 이메일, 비밀번호, id값(auto_increment)
                System.out.println("이름을 입력하세요");
                String name = br.readLine();
                System.out.println("이메일을 입력하세요");
                String email = br.readLine();
                System.out.println("비밀번호를 입력하세요");
                String pw = br.readLine();
                Author author = new Author(name, email, pw);
                authorList.add(author);

            } else if (n==2) {
//                3-2.회원 전체 목록 조회 : id, email
                System.out.println("회원 전체 목록을 조회합니다.");
                for(Author a : authorList) {
                    System.out.println(" id : " + a.getId() + " email : " + a.getEmail());
                }
            } else if ( n==3) {
//                3-3.회원 상세 조회(id로 조회 -> email로 조회) : id, email, name, password, 작성글수(postList에서 조회하거나, author객체에서 postList목록을 변수로 갖는것도 가능)
                System.out.println("회원 ID를 입력하세요");
                Long id = Long.parseLong(br.readLine());

                Author author = null;
                for (Author a : authorList) {
                    if(a.getId() == id) {
                        author = a;
                    }
                }
                System.out.println("id : " + author.getId() + " email : " + author.getEmail() + " name " + author.getName() + " passwor : " + author.getPw()
                + "작성글 수 " + author.getPost().size());

            } else if (n ==4) {
//                3-4.게시글 작성 : id, title, contents, 작성자Email(직접 Author 객체를 변수로 갖는것도 가능)
                System.out.println("title을 입력하세요 ");
                String title = br.readLine();
                System.out.println("contents를 입력하세요 ");
                String contents = br.readLine();
                System.out.println("email을 입력하세요 ");
                String email = br.readLine();
                Author author = null;
                for(Author a : authorList) {
                    if (a.getEmail().equals(email)) {
                        author = a;
                    }
                }
                Post post = new Post(title,contents, author);
                postList.add(post);

            } else if (n==5) {
//                3-5.게시물 목록 조회 : id(post), title
                System.out.println("게시글 목록을 조회합니다");
                for (Post p : postList) {
                    System.out.println(" id : " + p.getId() + " title : " + p.getTitle());
                }
            } else if (n==6) {
//                3-6.게시물 상세 조회(게시글 id로 조회) : id, title, contents, 작성자이름
                System.out.println("게시글 Id를 입력해주세요");
                Long id = Long.parseLong(br.readLine());

                Post post = null;
                for(Post p : postList) {
                    if(p.getId() == id) {
                        post = p;
                        break;
                    }
                }
                System.out.println("id : " + post.getId() + " title : " + post.getTitle()+ " contents : " + post.getContents() + " 작성자 이름 " + post.getAuthor().getName());

            }

        }

    }
}

class Author {
    private static long sta_id;
    private  Long id;
    private String name;
    private String email;
    private String pw;
    private List<Post> post;

    public Author(String name, String email, String pw) {
        sta_id++;
        this.id =sta_id;
        this.name = name;
        this.email = email;
        this.pw = pw;
        this.post = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPw() {
        return pw;
    }

    public List<Post> getPost() {
        return post;
    }
}

class Post {
    private Long id;
    private static long sta_id;
    private String title;
    private String contents;
    private Author author;

    public Post( String title, String contents, Author author) {
       sta_id++;
        this.id = sta_id;
        this.title = title;
        this.contents = contents;
        this.author = author;
        author.getPost().add(this);
    }

    public Long getId() {
        return id;
    }

    public static Long getSta_id() {
        return sta_id;
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