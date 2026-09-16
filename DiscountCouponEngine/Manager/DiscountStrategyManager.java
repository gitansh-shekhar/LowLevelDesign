package DiscountCouponEngine.Manager;


import DiscountCouponEngine.DiscountStrategy.DiscountStrategy;
import DiscountCouponEngine.DiscountStrategy.DiscountWithCap;
import DiscountCouponEngine.DiscountStrategy.FlatDiscount;
import DiscountCouponEngine.DiscountStrategy.PercentDiscount;
import DiscountCouponEngine.Enum.DiscountType;

public class DiscountStrategyManager {
    private static  DiscountStrategyManager discountStrategyManager;
    private DiscountStrategyManager(){};

    public static DiscountStrategyManager getInstance(){
        if(discountStrategyManager  == null){
            synchronized (DiscountStrategyManager.class){
                if(discountStrategyManager == null){
                    discountStrategyManager = new DiscountStrategyManager();
                }
            }
        }
        return discountStrategyManager;
    }
    public DiscountStrategy getStrategy(DiscountType discountType, double minCap , double p2 , double p3){
          if(discountType == DiscountType.Flat){
              return new FlatDiscount(minCap , p2);
          }
          else if(discountType == DiscountType.Percent){
              return new PercentDiscount(minCap , p2);
          }
          else if(discountType == DiscountType.Percent_with_cap){
              return new DiscountWithCap(minCap , p2 , p3);
          }
          return null;
    }
}
