package Intermediate.Exercise1week1StrategyPattern;
public class ShoppingCartApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("Book", 200);
        Item item2 = new Item("Pen", 50);

        cart.addItem(item1);
        cart.addItem(item2);

        // Pay by credit card
        PaymentStrategy creditCard = new CreditCardStrategy("1234567890123456", "John Doe", "123", "12/25");
        cart.pay(creditCard);

        // Pay by PayPal
        PaymentStrategy payPal = new PayPalStrategy("john@example.com", "password");
        cart.pay(payPal);
    }
}
