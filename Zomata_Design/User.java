package Zomata_Design;

import java.util.ArrayList;
import java.util.List;

public class User {
    List<Food> cart ;
    String name ;
    String City;
    String mobileNo;
    PaymentProcessor paymentProcessor;
    double amount = 0;
    User(String name , String City , String mobileNo){
        this.name = name;
        this.City =City;
        this.mobileNo = mobileNo;
        cart = new ArrayList<>();

    }
    void addToCart(Food food){
        cart.add(food);
        amount+=food.getPrice();
    }
    void removeFromCart(Food food){
        cart.remove(food);
        amount-=food.getPrice();
    }

    void PlaceOrder(PaymentProcessor paymentProcessor){
        if(amount==0){
            System.out.println("Cart is Empty");
            return;
        }
        boolean done =  paymentProcessor.pay(amount);
        if(done){
            for(Food food : cart){
              ResturantOwner resturantOwner = food.getResturantOwner();
              resturantOwner.update(food , this);
            }
            System.out.println("Order Placed");
        }

    }
}
