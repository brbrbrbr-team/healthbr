package brbrbrbrbr.healthbr.repository;

import brbrbrbrbr.healthbr.entity.Recommendation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecommendationRepository extends CrudRepository<Recommendation, Long> {

    List<Recommendation> findAllByPatientSnils(String id);

}
