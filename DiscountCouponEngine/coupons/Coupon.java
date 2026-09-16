package DiscountCouponEngine.coupons;

import DiscountCouponEngine.cart.Cart;

public abstract class Coupon {
    private Coupon next;
    public void applyDisCount(Cart cart){
        if(isApplicable(cart)){
            double amount = applyCoupon(cart);
            cart.applyDiscount(amount);
            if(!isCombinable())return;
        }
        if(next!=null) next.applyDisCount(cart);
    }
    public abstract boolean  isApplicable(Cart cart);
    public abstract double applyCoupon(Cart cart);
    public  boolean isCombinable(){return true;};
}
