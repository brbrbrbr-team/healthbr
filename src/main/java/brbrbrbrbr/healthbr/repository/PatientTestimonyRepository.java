package brbrbrbrbr.healthbr.repository;

import brbrbrbrbr.healthbr.entity.Patient;
import brbrbrbrbr.healthbr.entity.PatientTestimony;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientTestimonyRepository extends CrudRepository<PatientTestimony, Long> {

    List<PatientTestimony> findAllByPatientSnils(String snils);

}
