package liliana.session_7.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Product {
    private String name;
    private int quantity;
    private double price;
}
