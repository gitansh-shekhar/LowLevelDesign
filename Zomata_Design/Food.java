package Zomata_Design;

import java.util.Objects;
public class Food {
    private String name;
    private double price;
    private Resturant resturant;
    private ResturantOwner resturantOwner;
    Food(String name , double price , Resturant resturant , ResturantOwner resturantOwner){
        this.name = name;
        this.price = price;
        this.resturant = resturant;
        this.resturantOwner = resturantOwner;
    }

    public ResturantOwner getResturantOwner() {
        return resturantOwner;
    }

    public void setResturantOwner(ResturantOwner resturantOwner) {
        this.resturantOwner = resturantOwner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Resturant getResturant() {
        return resturant;
    }

    public void setResturant(Resturant resturant) {
        this.resturant = resturant;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return Double.compare(price, food.price) == 0 && Objects.equals(name, food.name) && Objects.equals(resturant, food.resturant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, resturant);
    }
}
