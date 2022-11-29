package com.example.Lab3.Controllers;

import com.example.Lab3.Entity.Award;
import com.example.Lab3.Entity.Awarder;
import com.example.Lab3.repos.AwardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AwardController {
    @Autowired
    AwardRepo awardRepo;

    @RequestMapping("/award")
    public String award(Model model) {
        var awards = awardRepo.findAll();
        model.addAttribute("awards", awards);
        return "award";
    }

    @RequestMapping(value = "/award/addAward", method = RequestMethod.GET)
    public String addAward(
            Model model) {
        model.addAttribute("award", new Award());
        return "add-award";
    }

    @RequestMapping(value = "/award/addAward", method = RequestMethod.POST)
    public String addAwardSubmit(@ModelAttribute Award award,
                                   Model model) {
        try {
            awardRepo.save(award);
            return "redirect:/award";
        }
        catch (Exception ex) {
            String errorMessage = ex.getMessage();
            model.addAttribute("errorMessage", errorMessage);
            return "add-award";
        }

    }
    @RequestMapping(value = "/award/deleteAward/{id}", method = RequestMethod.GET)
    public String deleteAward(@PathVariable(value = "id") Long id,
                                Model model) {
        try {
            awardRepo.deleteById(id);
            return "redirect:/award";
        }
        catch (Exception ex) {
            String errorMessage = ex.getMessage();
            model.addAttribute("errorMessage", errorMessage);
            return "award";
        }

    }

    @RequestMapping(value = "/award/editAward/{id}", method = RequestMethod.GET)
    public String editAward(@PathVariable(value = "id") Long id,
                              Model model) {
        Award award = awardRepo.findById(id).get();
        model.addAttribute("award", award);
        return "edit-award";
    }

    @RequestMapping(value = "/award/editAward", method = RequestMethod.POST)
    public String editAwardSubmit(@ModelAttribute Award award,
                                    Model model) {
        try {
            var item = awardRepo.findById((long) award.getId()).get();
            item.setAwardName(award.getAwardName());
            awardRepo.save(item);
            return "redirect:/award";
        }
        catch (Exception ex) {
            String errorMessage = ex.getMessage();
            model.addAttribute("errorMessage", errorMessage);
            return "edit-award";
        }

    }
}
