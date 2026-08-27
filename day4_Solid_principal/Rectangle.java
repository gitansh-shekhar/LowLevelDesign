package day4_Solid_principal;

public class Rectangle implements Shape {
    private double length;
    private double breadth;
    public Rectangle(double length , double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double findArea(){
        return length*breadth;
    }

}
