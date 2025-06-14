package liliana.session_12.entity;


import lombok.*;

import javax.validation.constraints.*;
import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;

    @NotBlank(message = "Tên không được để trống")
    private String name;

    @NotBlank(message = "Email không được để trống")
    @Email(message = "Email không hợp lệ")
    private String email;

    @NotNull(message = "Ngày sinh không được để trống")
    private Date dob;

    // Getter / Setter
}
