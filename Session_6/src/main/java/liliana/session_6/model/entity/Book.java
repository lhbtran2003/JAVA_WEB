package liliana.session_6.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private int id;
    private String name;
    private BigDecimal price;

    public Book(BigDecimal price, String name) {
        this.price = price;
        this.name = name;
    }
}
