package liliana.session_7.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Product {
    private final Long id;
    private final String name;
    private int quantity;
    private final double price;
    private final Integer stock;
    private final String description;
    private final String image;


}
