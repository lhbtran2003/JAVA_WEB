package liliana.session_8.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Product {
    private String name;
    private int quantity;
    private double price;
}
