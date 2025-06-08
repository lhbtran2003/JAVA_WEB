package liliana.session_15.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
public class User {
    @NotBlank(message = "Tên không được để trống")
    private String name;
    @NotBlank(message = "Email không được để trống")
    @Email(message = "Email không hợp lệ")
    private String email;
    @NotBlank(message = "Mật khẩu không được để trống")
    @Size(min = 3, message = "Mật khẩu phải từ 3 ký tự")
    private String password;
}
