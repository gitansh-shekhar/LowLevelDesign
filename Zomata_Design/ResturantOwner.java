package Zomata_Design;
public class ResturantOwner {
    String name;
    Resturant resturantsOwned;
    ResturantOwner(String name  , Resturant resturant){
        this.name = name ;
        this.resturantsOwned = resturant;
    }

    void addFoodToMenu(Food food){
        Menu menu = resturantsOwned.getMenu();
        menu.addFood(food);

    }
    void removeFoodFromMenu(Food food){
        Menu menu = resturantsOwned.getMenu();
        menu.removeFood(food);
    }
    void update(Food food , User user){
        System.out.println("Order will be delivered shortly.");
    }




}
