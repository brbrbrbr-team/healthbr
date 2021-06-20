package brbrbrbrbr.healthbr.service;

import brbrbrbrbr.healthbr.dto.PatientDto;
import brbrbrbrbr.healthbr.entity.Patient;

public interface PatientService {

    Patient registerNewUser(PatientDto patient);

}
