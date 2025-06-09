package liliana.session_16.model.entity;

import liliana.session_16.service.UniqueEmail;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;

    @NotBlank(message = "Username không được bỏ trống")
    private String username;

    @NotBlank(message = "Password không được bỏ trống")
    @Size(min = 3, message = "Mat khau phai co it nhat 3 ki tu")
    private String password;

    @NotBlank(message = "Email không được bỏ trống")
    @Email(message = "Email sai định dạng")
    @UniqueEmail()
    private String email;

    private String role;
    private boolean status;
}
