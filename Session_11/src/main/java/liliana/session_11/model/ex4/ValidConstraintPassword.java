package liliana.session_11.model.ex4;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidConstraintPassword implements ConstraintValidator<ValidPassword,String>{
    @Override
    public void initialize(ValidPassword constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}
