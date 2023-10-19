package org.example;

public class Main {
    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Aleksey");

        Square s = new Square(7);
//        s.l = 5;
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

        Rectangle r = new Rectangle(3,4);
//        r.a = 3;
//        r.b = 4;
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));
    }
    public static void hello(String somebody){
        System.out.println("Hello, " + somebody +"!");
    }
    public static double area(Square s){
        return s.l * s.l;
    }
    public static double area(Rectangle r){
        return r.a * r.b;
    }
}