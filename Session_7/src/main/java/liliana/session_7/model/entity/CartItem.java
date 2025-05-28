package liliana.session_7.model.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class CartItem {
    private Product product;
    private int quantity;
}
