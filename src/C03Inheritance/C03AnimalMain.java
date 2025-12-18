package C03Inheritance;

import java.io.IOException;

public class C03AnimalMain extends Animal  {
    @Override
    public void sound() {
        System.out.println("오버라이드");
    }

    public static void main(String[] args) throws IOException {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.sound2();
//        animal 에서 상속받은 sound를 사용  sound2는 미사용됨
        cat.sound();

//        상속관계일 때는 부모클래스의 타입을 자식 클래스의 객체타입으로 지정 가능
        Animal dog2 = new Dog();
        dog2.sound();
//        부모클래스의 타입으로 저장시, 부모클래스에서 정의된 메서드만 객체에서 시용가능
//        dog2.sound2();


    }
}
class Animal{
    public void sound() {
        System.out.println("동물이 소리를 냅니다");
    }
}
class Dog extends Animal {
//    @Override
//    public void sound(){
//        System.out.println("멍~");
//    }
    public void sound2(){
        System.out.println("멍멍멈멍");
    }
}

class Cat extends Animal {
//    @Override
//    public void sound(){
//        System.out.println("야야야야야");
//    }
    public void sound2(){
        System.out.println("야옹야옹");
    }
}