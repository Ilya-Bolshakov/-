package com.example.Lab3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AwarderController {
    @GetMapping("/awarder")
    public String awarder(
            @RequestParam(name = "name", required = false, defaultValue = "Ilya") String name,
            Model model) {
        model.addAttribute("name", name);
        return "awarder";
    }
}
