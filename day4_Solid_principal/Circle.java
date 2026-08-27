package day4_Solid_principal;

public class Circle implements Shape {
     private double radius;
     private Double pi  = Math.PI;
     public Circle(double radius ){
         this.radius = radius;
     }

     public double findArea(){
         return pi*radius*radius;
     }
}
