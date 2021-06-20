package brbrbrbrbr.healthbr.validator;

import brbrbrbrbr.healthbr.dto.PatientDto;
import brbrbrbrbr.healthbr.validator.ann.PasswordMatches;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (value == null) return false;
        PatientDto user = (PatientDto) value;
        return user.getPassword() != null && Objects.equals(user.getPassword(), user.getRepeatPassword());
    }

}
