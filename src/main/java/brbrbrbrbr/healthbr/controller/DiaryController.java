package brbrbrbrbr.healthbr.controller;

import brbrbrbrbr.healthbr.dto.DiaryDto;
import brbrbrbrbr.healthbr.dto.PatientDto;
import brbrbrbrbr.healthbr.entity.PatientTestimony;
import brbrbrbrbr.healthbr.entity.Recommendation;
import brbrbrbrbr.healthbr.repository.PatientTestimonyRepository;
import brbrbrbrbr.healthbr.repository.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static brbrbrbrbr.healthbr.HealthbrApplication.PROJECT_NAME;

@Controller
public class DiaryController {

    private static final String SNILS = "123-456-789-64";

    @Autowired
    private PatientTestimonyRepository testimonyRepository;

    @Autowired
    private RecommendationRepository recommendationRepository;

    @GetMapping("/diary")
    public ModelAndView displayDiary(Map<String, Object> model) {
        model.put("title", PROJECT_NAME);
        model.put("diary", new DiaryDto());

        final List<Recommendation> recommendations = recommendationRepository.findAllByPatientSnils(SNILS);
        Collections.reverse(recommendations);

        model.put("recommendations", recommendations);

        return new ModelAndView("diary", model);
    }

    @PostMapping("/diary")
    public ModelAndView newPressure(@ModelAttribute("diary") @Valid DiaryDto dairy) {
        final PatientTestimony patient = PatientTestimony.builder()
                .patientSnils(SNILS)
                .topPressure(dairy.getTopPressure())
                .bottomPressure(dairy.getBottomPressure())
                .message(dairy.getMessage())
                .sentAt(LocalDateTime.now())
                .build();

        testimonyRepository.save(patient);
        return displayDiary(new HashMap<>());
    }

    @PostMapping("/to_diary")
    public String toDiary() {
        return "redirect:/diary";
    }

}