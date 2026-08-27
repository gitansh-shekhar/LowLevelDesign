package DecoratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        IPizza thinCrustPizza = new ThinCrustPizza();

        System.out.println(".........Simple Pizza..........");
        System.out.println("Description :"+ thinCrustPizza.getDescription() + ", " +"Price :" + thinCrustPizza.getPrice());

        System.out.println("........Adding topping.......... ");

        thinCrustPizza = new CheeseTopping(thinCrustPizza);
        System.out.println("Description :"+ thinCrustPizza.getDescription() + ", " +"Price :" + thinCrustPizza.getPrice());

        System.out.println("........Adding Second topping.......... ");
        thinCrustPizza = new MushroomTopping(thinCrustPizza);

        System.out.println("Description :"+ thinCrustPizza.getDescription() + ", " +"Price :" + thinCrustPizza.getPrice());
    }
}
