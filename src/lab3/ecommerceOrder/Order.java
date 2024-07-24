package lab3.ecommerceOrder;

public class Order {
    private final String customerId;
    private final String category;
    private final double price;
    private final int quantity;

    // Constructor
    public Order(String customerId, String category, double price, int quantity) {
        this.customerId = customerId;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getCustomerId() {
        return customerId;
    }

    public String getCategory() {
        return category;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
}
