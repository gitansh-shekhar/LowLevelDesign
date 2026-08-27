package Zomata_Design;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<Food> foods = new ArrayList<>();
    public void addFood(Food food){
        if(foods.contains(food)){
            System.out.println(food.getName()+" already in the menu");
        }
        else {
            foods.add(food);
            System.out.println(food.getName()+" added successfully");
        }
    }
    public void removeFood(Food food){
        if(foods.contains(food)){
            foods.remove(food);
            System.out.println(food.getName()+ " removed successfully");
        }
        else {
            System.out.println(food.getName()+" is not in Menu");
        }
    }

}
