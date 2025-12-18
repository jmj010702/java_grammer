package C03Inheritance;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class C06AbstratMain {
    public static void main(String[] args) throws IOException {
//        추상 클래스는 구현체가 없는 메서드가 있으므로, 기본적으로 객체 생성 불가능
//        AbstractAnimal a1 = new AbstractAnimal(); //빨간불 들어옴

        AbstractDog d2 = new AbstractDog();
        d2.makesound();
        d2.makesound2();

//        인터페이스는 모든 메서드가 abstract인 클래스
//         인터페이스는 구현체가 없으므로, 별도의 객체 생성 불가
//        List<Integer> mylist = new List();





    }
}

//클래스에 추상메서드가 하나라도 있으면 이 클래스는 추상클래스가 되고, 클래스 앞에 abstract클래스가 붙음
abstract class AbstractAnimal {
    void makesound() {
        System.out.println("동물은 소리를냅니다");
    }

    //    abstract(추상메서드) 메서드는 메서드를 선언만하고 구현이 없는 메서드
//    해당 클래스를 상속받는 클래스에서 abstract메서드 구현
    abstract void makesound2();
}

class AbstractDog extends AbstractAnimal {

    //  구현되지 않은 makesound2를 구현
    @Override
    void makesound2() {
        System.out.println("멍멍");
    }
}

//final 키워드를 통해 상속 불가한 클래스로 변경
final class FinalParents {

}

abstract class test{}
//자신의 구현체 가능
//구현안된 메서드도 OK

interface test1{}
//모든 메서드가 abstract