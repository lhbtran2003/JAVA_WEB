package liliana.session_17.model.entity.ex2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Setter
@Getter
@NoArgsConstructor
public class CustomerDTO {
    @NotBlank(message = "ko đc để trống")
    private String username;

    @NotBlank(message = "ko đc để trống")
    private String password;
}
