package Zomata_Design;

public class MainPage {

    ResturantManager resturantManager ;
    MainPage(ResturantManager resturantManager ){
        this.resturantManager = resturantManager;
    }

    void displayFood(){
        for(Resturant resturant : resturantManager.resturants){
            for(Food food : resturant.getMenu().foods){
                System.out.println("Name :"+ food.getName() +", Price : "+food.getPrice() +", Resturant Name :"+food.getResturant().getName());
            }
        }
    }
}
