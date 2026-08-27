package Zomata_Design;

import java.util.ArrayList;
import java.util.List;

public class ResturantManager {
    List<Resturant> resturants = new ArrayList<>();

    void RegisterResturant(Resturant resturant){
        resturants.add(resturant);
        System.out.println(resturant.getName()+" registered Successfully");
    }

    void UnRegisterResturant(Resturant resturant){
        if(resturants.contains(resturant)){
            resturants.remove(resturant);
            System.out.println("Resturant unregistered Successfully");
        }
        else System.out.println("Resturant does not Exist");
    }

}
