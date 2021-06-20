package brbrbrbrbr.healthbr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

import static brbrbrbrbr.healthbr.HealthbrApplication.PROJECT_NAME;

@Controller
public class LoginController {

    @GetMapping("/login")
    public ModelAndView showForm1(Map<String, Object> model) {
        model.put("title", PROJECT_NAME);

        return new ModelAndView("login", model);
    }

    @GetMapping("/")
    public ModelAndView showForm2(Map<String, Object> model) {
        model.put("title", PROJECT_NAME);

        return new ModelAndView("login", model);
    }

    @GetMapping("/index")
    public ModelAndView showForm3(Map<String, Object> model) {
        model.put("title", PROJECT_NAME);

        return new ModelAndView("login", model);
    }

}