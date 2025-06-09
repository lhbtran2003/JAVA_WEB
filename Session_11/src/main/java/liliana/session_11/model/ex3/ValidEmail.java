package liliana.session_11.model.ex3;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = EmailConstraintValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidEmail {
    String message() default "Email không đúng định dạng";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
