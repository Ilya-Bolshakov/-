package com.example.Lab3.Controllers;

import com.example.Lab3.repos.ListRecipientsAndAwardsRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
        awarderRepos.deleteById(id);
        return "redirect:/awarder";
    }
}
