package liliana.session_16.service;

import javax.validation.Constraint;
import javax.validation.Payload;
@Constraint(validatedBy = UniqueEmailValidator.class)
public @interface UniqueEmail {
    String message() default "Email already registered";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
