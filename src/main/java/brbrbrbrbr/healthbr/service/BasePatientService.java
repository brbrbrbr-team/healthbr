package brbrbrbrbr.healthbr.service;

import brbrbrbrbr.healthbr.dto.PatientDto;
import brbrbrbrbr.healthbr.entity.Patient;
import brbrbrbrbr.healthbr.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasePatientService implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Patient registerNewUser(PatientDto patientDto) {

        final Patient patient = patientRepository.findBySnils(patientDto.getSnils());
        if (patient != null) {
            throw new UnsupportedOperationException();
        }

        final Patient newPatient = Patient.builder()
                .snils(patientDto.getSnils())
                .password(patientDto.getPassword())
                .device(-1)
                .build();

        patientRepository.save(newPatient);

        return newPatient;
    }

}
