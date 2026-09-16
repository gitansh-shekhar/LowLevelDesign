package DiscountCouponEngine.DiscountStrategy;

public class DiscountWithCap implements DiscountStrategy{

    private double minCap;
    private double maxDiscount;
    private double percentDiscount;

    public DiscountWithCap(Double minCap , Double maxDiscount , Double percentDiscount){
        this.minCap = minCap;
        this.maxDiscount = maxDiscount;
        this.percentDiscount = percentDiscount;
    }
    @Override
    public double applyDiscount(Double amount) {
         if(amount<minCap)return 0;
         double disAmount = (amount * percentDiscount)/100 ;
         return Math.min(disAmount , maxDiscount);
    }


}
