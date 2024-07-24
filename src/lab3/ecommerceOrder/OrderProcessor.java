package lab3.ecommerceOrder;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderProcessor {

    // Exercise 3.1: Refactor order total calculation using lambda expression
    public double calculateTotal(List<Order> orders) {
        return orders.stream()
                .mapToDouble(order -> order.getPrice() * order.getQuantity())
                .sum();
    }

    // Exercise 3.1: Filter and transform order items based on criteria
    public double calculateFilteredTotal(List<Order> orders, double minPrice) {
        return orders.stream()
                .filter(order -> order.getPrice() > minPrice)
                .mapToDouble(order -> order.getPrice() * order.getQuantity())
                .sum();
    }

    // Exercise 3.2: Calculate total order amount using Streams
    public double calculateTotalAmount(List<Order> orders) {
        return orders.stream()
                .mapToDouble(order -> order.getPrice() * order.getQuantity())
                .sum();
    }

    // Exercise 3.2: Count orders by customer
    public Map<String, Long> countOrdersByCustomer(List<Order> orders) {
        return orders.stream()
                .collect(Collectors.groupingBy(Order::getCustomerId, Collectors.counting()));
    }

    // Exercise 3.3: Refactor using Streams
    public double calculateElectronicsTotal(List<Order> orders) {
        return orders.stream()
                .filter(order -> "Electronics".equals(order.getCategory()))
                .mapToDouble(order -> order.getPrice() * order.getQuantity())
                .sum();
    }
}
