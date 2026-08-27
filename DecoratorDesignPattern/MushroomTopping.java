package DecoratorDesignPattern;

public class MushroomTopping extends PizzaDecorator {
    MushroomTopping(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Mushroom Topping";
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 30.0;
    }
}
