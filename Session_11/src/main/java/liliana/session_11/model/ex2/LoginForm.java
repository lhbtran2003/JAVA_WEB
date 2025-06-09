package liliana.session_11.model.ex2;

import liliana.session_11.model.ex3.ValidEmail;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Setter
@Getter
@NoArgsConstructor
public class LoginForm {
    @NotBlank(message = "ko dc de trong")
    private String name;
    @NotBlank(message = "ko dc de trong")
    @Size(min = 8, message = "it nhat 8 ki tu")
    private String password;
    @NotBlank(message = "ko dc de trong")
    @ValidEmail(message = "email ko hop le")
    private String email;
}
