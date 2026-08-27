package day4_Solid_principal;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(7);
        Rectangle r1 = new Rectangle(2 , 3);
        Square s1 = new Square(4);
        System.out.println(c1.findArea());
        System.out.println(r1.findArea());
        System.out.println(s1.findArea());
    }
}
