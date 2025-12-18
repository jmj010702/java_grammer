package C03Inheritance;

import java.io.IOException;

public class C05ProtectedClass {
    public static void main(String[] args) throws IOException {

        C04ProtectedClass c1 = new C04ProtectedClass();
        System.out.println(c1.st1); //public
        System.out.println(c1.st2); //protected
        System.out.println(c1.st3); //default
//        System.out.println(c1.st4); //privated
    }
}
