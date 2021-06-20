package brbrbrbrbr.healthbr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

import static brbrbrbrbr.healthbr.HealthbrApplication.PROJECT_NAME;

@Controller
public class RecommendationsController {

    @GetMapping("/recommendations")
    public ModelAndView displayArticle(Map<String, Object> model) {
        model.put("title", PROJECT_NAME);

        return new ModelAndView("recommendations", model);
    }

}
