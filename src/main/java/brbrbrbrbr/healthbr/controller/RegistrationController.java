package brbrbrbrbr.healthbr.controller;

import brbrbrbrbr.healthbr.dto.PatientDto;
import brbrbrbrbr.healthbr.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Map;

import static brbrbrbrbr.healthbr.HealthbrApplication.PROJECT_NAME;

@Controller
public class RegistrationController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/reg")
    public ModelAndView showForm(Map<String, Object> model) {
        model.put("title", PROJECT_NAME);
        model.put("patient", new PatientDto());

        return new ModelAndView("reg", model);
    }

    @PostMapping("/reg")
    public ModelAndView registerUserAccount(@ModelAttribute("patient") @Valid PatientDto patient, HttpServletRequest request, Errors errors) {
        System.out.println("11111111111111111");
        if (errors.hasErrors()) {
            return new ModelAndView("successRegister", "patient", patient);
        }

        patientService.registerNewUser(patient);

        return null;
    }

}