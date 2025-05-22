package liliana.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor()
public class Product {
    private int id;
    private String productName;
    private double price;
    private String description;

    public Product(String productName, int id, String description) {
        this.productName = productName;
        this.id = id;
        this.description = description;
    }
}
