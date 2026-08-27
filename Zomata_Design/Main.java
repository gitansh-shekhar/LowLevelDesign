package Zomata_Design;

public class Main {
    public static void main(String[] args) {
        ResturantManager Zomato = new ResturantManager();

        Resturant resturant = new Resturant("Apna Zaika" , new Menu());
        ResturantOwner resturantOwner = new ResturantOwner("Gitansh" , resturant);
        Food f1 =new Food("Biryani" , 250 ,resturant , resturantOwner);
        Food f2 = new Food("Cold Drink" , 50 ,resturant , resturantOwner);
        resturantOwner.addFoodToMenu(f1);
        resturantOwner.addFoodToMenu(f2);

        User user1 = new User("Shekhar" , "Muzaffarpur" , "9905077185");
        MainPage mainPage = new MainPage(Zomato);
        mainPage.displayFood();

        user1.addToCart(f1);
        user1.addToCart(f2);
        user1.PlaceOrder(new UPI());


    }
}
