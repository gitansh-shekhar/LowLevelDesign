package DecoratorDesignPattern;

public class CheeseTopping extends PizzaDecorator{

    CheeseTopping(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with CheeeseTopping";
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 20.0;
    }
}
