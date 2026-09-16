package DiscountCouponEngine.DiscountStrategy;

public class PercentDiscount implements  DiscountStrategy{
    private double percentDistcount;
    private double minCap;


    public  PercentDiscount(Double minCap , double discountPercent ){
        this.minCap = minCap;
        this.percentDistcount = discountPercent ;
    }
    @Override
    public double applyDiscount(Double amount) {
        if(amount >= minCap){
            return (amount * percentDistcount)/100 ;

        }
        else return 0;
    }
}
