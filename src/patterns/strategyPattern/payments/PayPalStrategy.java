package patterns.strategyPattern.payments;

public class PayPalStrategy implements PaymentStrategy {


    private String emailId;
    private String password;

    public PayPalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amt) {
        System.out.println(amt + " paid with paypal");
    }
}
