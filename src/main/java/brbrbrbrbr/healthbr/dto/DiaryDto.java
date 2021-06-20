package brbrbrbrbr.healthbr.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class DiaryDto {

    private String snils;

    private int topPressure;

    private int bottomPressure;

    private String message;

}
