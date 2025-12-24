package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Repository {
    private List<Entity> entityList;

    private Entity entity;

public Repository() {
    this.entityList = new ArrayList<>();
}

//    회원가입
public void register(Entity entity) {
   this.entityList.add(entity);
}
//    findbyemail
    public Optional<Entity> findByEmail(String email) {
        for(Entity e : entityList) {
            if(e.getEmail().equals(email)) {
                return Optional.of(e);
            }
        }
        return Optional.empty();
    }

//    findbyid
    public Optional<Entity> findById(long id) {
        for(Entity e : entityList) {
            if(e.getId() == id) {
                return Optional.of(e);
            }
        }
        return Optional.empty();
    }

//    findAll
public List<Entity> findAll () {
        return this.entityList;
}

}
