package liliana.session_16.service;

import org.hibernate.validator.internal.constraintvalidators.bv.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String> {
    @Autowired
    private AuthService authService;

    @Override
    public void initialize(UniqueEmail constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        if (email == null || email.trim().isEmpty()) {
            return true;
        }
        return !authService.isExistEmail(email);
    }
}
