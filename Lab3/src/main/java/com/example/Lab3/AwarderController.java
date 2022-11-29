package com.example.Lab3;

import com.example.Lab3.repos.AwarderRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AwarderController {
    @Autowired
    private AwarderRepos awarderRepos;
    @RequestMapping("/awarder")
    public String awarder(
            @RequestParam(name = "name", required = false, defaultValue = "Ilya") String name,
            Model model) {
        //model.addAttribute("name", name);
        var awarders = awarderRepos.findAll();
        model.addAttribute("awarders", awarders);
        return "awarder";
    }

    @RequestMapping(value = "/awarder/addAwarder")
    public String addAwarder(
            Model model) {
        //model.addAttribute("name", name);
        //var awarders = awarderRepos.findAll();
        return "add-awarder";
    }
}
