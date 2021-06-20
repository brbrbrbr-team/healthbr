package brbrbrbrbr.healthbr.repository;

import brbrbrbrbr.healthbr.entity.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends CrudRepository<Patient, String> {

    Patient findBySnils(String snils);

}
