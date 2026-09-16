package DiscountCouponEngine.coupons;

import DiscountCouponEngine.DiscountStrategy.DiscountStrategy;
import DiscountCouponEngine.Enum.DiscountType;
import DiscountCouponEngine.Manager.DiscountStrategyManager;
import DiscountCouponEngine.cart.Cart;
import DiscountCouponEngine.cart.CartItem;

public class SeasonalOffer extends Coupon {

    private double percent;
    private String category;
    private DiscountStrategy strat;

    public SeasonalOffer(double pct, String cat) {
        this.percent  = pct;
        this.category = cat;
        this.strat    = DiscountStrategyManager.getInstance().getStrategy(DiscountType.Percent ,1000 , pct , 0 );
    }

    public double applyCoupon(Cart cart) {
        double subtotal = 0.0;
        for (CartItem item : cart.getCartItems()) {
            if (item.getProduct().getCategory().equals(category)) {
                subtotal += item.itemTotal();
            }
        }
        return strat.applyDiscount(subtotal);
    }
    @Override
    public boolean isApplicable(Cart cart) {
        for (CartItem item : cart.getCartItems()) {
            if (item.getProduct().getCategory().equals(category)) {
                return true;
            }
        }
        return false;
    }
}
