package liliana.session_11.model;

import liliana.session_11.model.ex4.ValidPassword;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.crypto.Mac;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Setter
@Getter
@NoArgsConstructor
public class User {
    @NotBlank(message = "ko dc de trong")
    private String name;
    @NotBlank(message = "ko dc de trong")
    @Email(message = "ko hop le")
    private String email;
    @NotBlank(message = "ko dc de trong")
    @Pattern(regexp = "^(0|\\\\+84)(3[2-9]|5[6|8|9]|7[0|6-9]|8[1-5]|9[0-9])[0-9]{7}$")
    private String phone;
    @NotBlank(message = "ko dc de trong")
    @ValidPassword()
    private String password;
    private String status;

}
    