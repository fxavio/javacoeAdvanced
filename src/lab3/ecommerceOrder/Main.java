package lab3.ecommerceOrder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        // Sample data
        List<Order> orders = Arrays.asList(
                new Order("customer1", "Electronics", 100.0, 2),
                new Order("customer2", "Clothing", 50.0, 3),
                new Order("customer1", "Electronics", 150.0, 1),
                new Order("customer3", "Electronics", 200.0, 1),
                new Order("customer2", "Clothing", 75.0, 2)
        );
        OrderProcessor processor = new OrderProcessor();
        // Calculate total order amount
        double total = processor.calculateTotal(orders);
        System.out.println("Total Order Amount: " + total);

        // Calculate filtered total for orders above a certain price
        double filteredTotal = processor.calculateFilteredTotal(orders, 60.0);
        System.out.println("Filtered Total (Price > 60): " + filteredTotal);

        // Calculate total amount using Streams
        double totalAmount = processor.calculateTotalAmount(orders);
        System.out.println("Total Amount using Streams: " + totalAmount);

        // Count orders by customer
        Map<String, Long> ordersByCustomer = processor.countOrdersByCustomer(orders);
        System.out.println("Orders by Customer: " + ordersByCustomer);

        // Calculate total amount for Electronics category
        double electronicsTotal = processor.calculateElectronicsTotal(orders);
        System.out.println("Total for Electronics: " + electronicsTotal);
    }
}
