package lab3.Products;

public class SwitchExpressionDemo {
    public static String getCategoryDiscountMessage(Product product) {
        return switch (product.category()) {
            case "Electronics" -> "Get 10% off on electronics!";
            case "Clothing" -> "Get 20% off on clothing!";
            default -> "No discounts available.";
        };
    }

    public static void main(String[] args) {
        Product electronics = new Product("Laptop", 1200.00, "Electronics");
        Product clothing = new Product("T-Shirt", 20.00, "Clothing");
        Product other = new Product("Book", 10.00, "Books");

        System.out.println(getCategoryDiscountMessage(electronics));
        System.out.println(getCategoryDiscountMessage(clothing));
        System.out.println(getCategoryDiscountMessage(other));
    }
}
