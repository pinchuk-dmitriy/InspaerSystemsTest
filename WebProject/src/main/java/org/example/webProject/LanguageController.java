package org.example.webProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LanguageController {

    @GetMapping
    public String main() {
        return "index";
    }

    @GetMapping("/rus")
    public String rusLanguage() {
        return "ruPage";
    }

    @GetMapping("/eng")
    public String engLanguage() {
        return "index";
    }

}
