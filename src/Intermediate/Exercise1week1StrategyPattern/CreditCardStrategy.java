package Intermediate.Exercise1week1StrategyPattern;

public class CreditCardStrategy implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    public CreditCardStrategy(String cardNumber, String cardHolderName, String expiryDate, String s) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card.");
    }
}