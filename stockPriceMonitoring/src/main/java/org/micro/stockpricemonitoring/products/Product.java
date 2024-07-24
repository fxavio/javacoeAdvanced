package org.micro.stockpricemonitoring.products;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
    private int id;
    private String title;
    private double price;
    private String description;
    private String category;
    @Override
    public String toString() {
        return "Product{id=" + id + ", title='" + title + "', price=" + price + ", category='" + category + "'}";
    }
}
