package DecoratorDesignPattern;

public class ThinCrustPizza implements IPizza{

    @Override
    public String getDescription() {
        return "Thin Crust Pizza";
    }

    @Override
    public Double getPrice() {
        return 100.0;
    }
}
