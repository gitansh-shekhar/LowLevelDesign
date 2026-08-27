package day4_Solid_principal;

public class Square implements Shape {
    private double side ;
    public Square(double side ){
        this.side = side ;
    }
    public double findArea(){
        return side*side;
    }

}
