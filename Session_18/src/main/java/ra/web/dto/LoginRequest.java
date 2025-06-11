package ra.web.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
@Setter
@Getter
@NoArgsConstructor

public class LoginRequest {
    @NotBlank(message = "ko đc để trống")
    private String username;

    @NotBlank(message = "ko đc để trống")
    private String password;
}
