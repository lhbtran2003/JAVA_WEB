package liliana.session_9.model.entity.ex1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Customer {
    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private boolean gender;
}
