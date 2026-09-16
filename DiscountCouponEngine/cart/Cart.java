package DiscountCouponEngine.cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> cartItems = new ArrayList<>();
    private double originalTotal = 0;
    private double discountTotal = 0;
    private boolean premiumMember = false;
    private String bankName;
    public Cart(String bankName  , boolean premiumMember){
        this.bankName = bankName ;
        this.premiumMember= premiumMember;
    }
    public void applyDiscount(Double d){
        discountTotal=Math.max(0 , discountTotal- d);

    }
    public void addTOCart(Product product , int quantity){
        cartItems.add(new CartItem(product , quantity));
        originalTotal+=product.getPrice();
        discountTotal+=product.getPrice();
    }
    public void checkOut(){
        System.out.println("Total Amount = "+originalTotal);
        System.out.println("Discounted Total Amount = "+discountTotal);
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public double getOriginalTotal() {
        return originalTotal;
    }

    public void setOriginalTotal(double originalTotal) {
        originalTotal = originalTotal;
    }

    public double getDiscountTotal() {
        return discountTotal;
    }

    public void setDiscountTotal(double discountTotal) {
        discountTotal = discountTotal;
    }

    public boolean isPremiumMember() {
        return premiumMember;
    }

    public void setPremiumMember(boolean premiumMember) {
        this.premiumMember = premiumMember;
    }
}
