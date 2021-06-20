package brbrbrbrbr.healthbr.dto;

import brbrbrbrbr.healthbr.validator.ann.PasswordMatches;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor

@PasswordMatches
public class PatientDto {

    private String snils;

    private String password;

    private String repeatPassword;

}
