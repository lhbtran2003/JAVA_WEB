package liliana.session_14.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest {
    @NotBlank(message = "Không được bỏ trống")
    private String username;
    @NotNull(message = "Không được bỏ trống")
    @Size(min = 3, message = "Tối thiểu 3 kí tự")
    private String password;
}
