package com.example.Lab3.Controllers;

import com.example.Lab3.Entity.Award;
import com.example.Lab3.Entity.listRecipientsAndAwards;
import com.example.Lab3.repos.ListRecipientsAndAwardsRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ListRecipientsAndAwardsController {
    @Autowired
    ListRecipientsAndAwardsRepos listRecipientsAndAwardsRepos;

    @RequestMapping("/listRecipientsAndAwards")
    public String listRecipients(Model model) {
        var listRecipientsAndAwards = listRecipientsAndAwardsRepos.findAll();
        model.addAttribute("listRecipientsAndAwards", listRecipientsAndAwards);
        return "list-recipients-and-awards";
    }

    @RequestMapping(value = "/listRecipientsAndAwards/delete/{id}", method = RequestMethod.GET)
    public String deleteAwarded(@PathVariable(value = "id") Long id,
                                Model model) {
        listRecipientsAndAwardsRepos.deleteById(id);
        return "redirect:/listRecipientsAndAwards";
    }

    @RequestMapping(value = "/listRecipientsAndAwards/add", method = RequestMethod.GET)
    public String addlistRecipientsAndAwards(
            Model model) {
        model.addAttribute("listRecipientsAndAwards", new listRecipientsAndAwards());
        return "add-list-recipients-and-awards";
    }

    @RequestMapping(value = "/listRecipientsAndAwards/add", method = RequestMethod.POST)
    public String addlistRecipientsAndAwardsSubmit(@ModelAttribute listRecipientsAndAwards listRecipientsAndAwards,
                                                   Model model) {
        try
        {
            listRecipientsAndAwardsRepos.save(listRecipientsAndAwards);
            return "redirect:/listRecipientsAndAwards";
        }
        catch (Exception ex) {
            String errorMessage = ex.getMessage();
            model.addAttribute("errorMessage", errorMessage);
            return "add-list-recipients-and-awards";
        }
    }
}
