package DecoratorDesignPattern;

public abstract class PizzaDecorator implements IPizza {

    private IPizza pizza;

    PizzaDecorator(IPizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public Double getPrice() {
        return pizza.getPrice();
    }
}
