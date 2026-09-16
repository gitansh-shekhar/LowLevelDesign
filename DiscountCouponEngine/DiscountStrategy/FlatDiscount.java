package DiscountCouponEngine.DiscountStrategy;

public class FlatDiscount implements DiscountStrategy{
    private double discount;
    private double minCap;
    public  FlatDiscount( Double cap, Double discount){
        this.discount = discount;
        this.minCap = cap;
    }

    @Override
    public double applyDiscount(Double amount) {
        if(amount >= minCap)return  discount ;
        else return 0;
    }
}
