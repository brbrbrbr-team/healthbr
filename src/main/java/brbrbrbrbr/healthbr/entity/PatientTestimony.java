package brbrbrbrbr.healthbr.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class PatientTestimony {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String patientSnils;

    private LocalDateTime sentAt;

    private int topPressure;

    private int bottomPressure;

    private String message;

    private int pulse;

}
