package PaymentGateway_System.entity;

public class PaymentRequest {

    private String sender;
    private String reciever;
    private double amount;
    private String currency;

    public PaymentRequest(String sender, String reciever, double amount, String currency) {
        this.sender = sender;
        this.reciever = reciever;
        this.amount = amount;
        this.currency = currency;
    }

    public String getSender() {
        return sender;
    }

    public String getReciever() {
        return reciever;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }
}
