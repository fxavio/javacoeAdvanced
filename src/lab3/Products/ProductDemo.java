package lab3.Products;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 1200.00, "Electronics");
        System.out.println(product.name());    // Output: Laptop
        System.out.println(product.price());   // Output: 1200.0
        System.out.println(product.category()); // Output: Electronics
    }
}
