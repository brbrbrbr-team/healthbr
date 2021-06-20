package brbrbrbrbr.healthbr.controller;

import brbrbrbrbr.healthbr.entity.PatientTestimony;
import brbrbrbrbr.healthbr.repository.PatientTestimonyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class DoctorController {

    @Autowired
    private PatientTestimonyRepository testimonyRepository;

    @GetMapping("/patient/{snils}")
    public ModelAndView showPatient(Map<String, Object> model, @PathVariable("snils") String snils) {

        final List<PatientTestimony> testimony = testimonyRepository.findAllByPatientSnils(snils);
        List<Integer> top = new ArrayList<>();
        List<Integer> bottom = new ArrayList<>();
        List<LocalDateTime> dates = new ArrayList<>();

        for (PatientTestimony t : testimony) {
            top.add(t.getTopPressure());
            bottom.add(t.getBottomPressure());
            dates.add(t.getSentAt());
        }
        model.put("plot-data-top", top);
        model.put("plot-data-bottom", bottom);
        System.out.println(dates);
        model.put("plot-data-dates", dates);

        return new ModelAndView("doctor", model);
    }

}
