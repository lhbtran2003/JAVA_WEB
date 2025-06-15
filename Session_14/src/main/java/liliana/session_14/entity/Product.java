package liliana.session_14.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @NotBlank(message = "Không được để trống")
    private String id;
    @NotBlank(message = "Không được để trống")
    private String name;
    @NotNull(message = "Không được để trống")
    @Min(value = 0, message = "Không được để giá âm")
    private double price;
}
