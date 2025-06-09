package liliana.session_11.model.ex4;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = ValidConstraintPassword.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPassword {
    String message() default "Mật khẩu không đúng định dạng";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
