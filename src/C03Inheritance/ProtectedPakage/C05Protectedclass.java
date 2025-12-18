package C03Inheritance.ProtectedPakage;

import C03Inheritance.C04ProtectedClass;

import java.io.IOException;

public class C05Protectedclass extends C04ProtectedClass{
    public static void main(String[] args) throws IOException {


        C05Protectedclass c1 = new C05Protectedclass();
        System.out.println(c1.st1); //public
        System.out.println(c1.st2); //protected
//        System.out.println(c1.st3); //default
//        System.out.println(c1.st4); //privated
    }
}