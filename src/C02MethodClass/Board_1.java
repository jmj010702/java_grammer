package C02MethodClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Board_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Author> authorList = new ArrayList<>();
        List<Post> postList = new ArrayList<>();

        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n==1) {
                String name = br.readLine();
                String email = br.readLine();
                String pw = br.readLine();

                Author author = new Author(name,email, pw);

                authorList.add(author);
            } else if (n==2) {
                for(Author a : authorList) {
                    System.out.println("id : " + a.getId()+ " email" + a.getEmail() );
                }
            } else if(n==3) {
                Long id = Long.parseLong(br.readLine());

                Author author = null;
                for(Author a : authorList) {
                    if(a.getId() == id) {
                        author = a;
                    }
                }
                System.out.println("email " + author.getEmail() + " id " + author.getId() + " count" + author.getPosts().size() );
            } else if (n==4)  {
                String title = br.readLine();
                String contents = br.readLine();
                String email = br.readLine();

                Author author = null;
                for(Author a : authorList) {
                    if(a.getEmail().equals(email)) {
                        author = a;
                    }
                }
                Post post = new Post(title, contents, author);
            } else if (n==5) {
                for (Post p : postList) {
                    System.out.println("id " + p.getId() + " title " + p.getTitle());
                }
            } else if(n==6) {
                Long id = Long.parseLong(br.readLine());

                Post post = null;

                for(Post p : postList) {
                    if(p.getId() == id) {
                        post = p;
                    }
                }
                System.out.println(" Id " + post.getId() + post.getAuthor().getName());
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
        private List<Post> posts;

    public Author(String name,  String email, String pw) {
        sta_id++;
        this.name = name;
        this.id = sta_id;
        this.email = email;
        this.pw = pw;
        this.posts = new ArrayList<>();
    }

    public static Long getSta_id() {
        return sta_id;
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

    public List<Post> getPosts() {
        return posts;
    }
}
class Post {
    private static long sta_id;
    private  Long id;
private String title;
private String contents;
private  Author author;

    public Post(String title, String contents, Author author) {
      sta_id++;
        this.id = sta_id;
        this.title = title;
        this.contents = contents;
        this.author = author;
        author.getPosts().add(this);
    }

    public static Long getSta_id() {
        return sta_id;
    }

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
}