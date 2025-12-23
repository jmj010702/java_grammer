package C07ExceptionfileJson.MemberException;
/*

import java.util.*;

//저장소역할을 하는 계층
//DB에 CRUD를 수행하는 계층
public class MemberRepository {
    private List<Member> memberList;

    public MemberRepository() {
        this.memberList = new ArrayList<>();
    }

    public void register(Member member) {
        this.memberList.add(member);
    }

//    public Member findByEmail(String email) {
//        Member member = null;
//        for (Member m : memberList) {
//            if (m.getEmail().equals(email)) {
//                member = m;
//            }
//        }
//        return member;
//    }
//
//    public Member findById(long id) {
//        Member member = null;
//        for (Member m : memberList) {
//            if (m.getId() == id) {
//                member = m;
//            }
//        }
//        return member;
//    }
//

    public Optional<Member> findByEmail(String email) {
        for (Member m : memberList) {
            if (m.getEmail().equals(email)) {
                return Optional.of(m);
            }
        }
        return Optional.empty();
    }

    public Optional<Member> findById(long id) {
        Member member = null;
        for (Member m : memberList) {
            if (m.getId() == id) {
                member = m;
                break;
            }
        }
        return Optional.ofNullable(member);
    }


    public List<Member> findAll() {
        return this.memberList;
    }
} */