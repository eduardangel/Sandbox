package org.example;

public class Main {
    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Aleksey");

        Square s = new Square(6);
//        s.l = 6;
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(3,4);
//        r.a = 3;
//        r.b = 4;
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
    }
    public static void hello(String somebody){
        System.out.println("Hello, " + somebody +"!");
    }

}