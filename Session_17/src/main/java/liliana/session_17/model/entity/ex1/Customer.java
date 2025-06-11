package liliana.session_17.model.entity.ex1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "ko đc để trống")
    @Column(unique = true, nullable = false)
    private String username;

    @NotBlank(message = "ko đc để trống")
    @Size(min = 3, message = "phải có ít nhất 3 kí tự")
    private String password;

    @NotBlank(message = "ko đc để trống")
    @Email(message = "email ko đúng định dạng")
    private String email;

    @NotBlank(message = "ko đc để trống")
    @Pattern(regexp = "\\d{10}", message = "sdt ko hợp le")
    private String phoneNumber;

    private String role;

    @Enumerated(EnumType.STRING)
    private Status status;
}
