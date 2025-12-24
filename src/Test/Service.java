package Test;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Service {
    private Repository repository;

    public Service() {
      repository = new Repository();
    }

//    register (email)이 중복이라면 회원가입 불가 에러
public void Register(String name, String email, String pw) {
        if(repository.findByEmail(email).isPresent()) {
            throw new IllegalArgumentException("이미 존재하는 이메일입니다");
        }
        Entity newentity = new Entity(name, email, pw);
        repository.register(newentity);
}
// findbyid
    public Entity findById(long id) {
        return repository.findById(id).orElseThrow( () -> new NoSuchElementException("id가 없습니다"));

    }
//    findAll
    public List<Entity> findAll() {
        return repository.findAll();
    }
//login
public void login(String email, String pw) {
       Entity entity = repository.findByEmail(email).orElseThrow( () -> new NoSuchElementException("이메일이 없습니다"));

        if(!entity.getPw().equals(pw)) {
            throw new NoSuchElementException("일치하는 비번이 없습니다");
        }
}

}
