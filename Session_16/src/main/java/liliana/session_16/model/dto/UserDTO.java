package liliana.session_16.model.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    @NotBlank(message = "Username không được bỏ trống")
    private String username;
    @NotBlank(message = "Password không được bỏ trống")
    @Size(min = 3, message = "Mat khau phai co it nhat 3 ki tu")
    private String password;


}
