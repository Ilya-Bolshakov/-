package com.example.Lab3.Controllers;

import com.example.Lab3.Entity.listRecipientsAndAwards;
import com.example.Lab3.repos.AwardRepo;
import com.example.Lab3.repos.AwarderRepos;
import com.example.Lab3.repos.ListRecipientsAndAwardsRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ListRecipientsAndAwardsController {
    @Autowired
    ListRecipientsAndAwardsRepos listRecipientsAndAwardsRepos;
    @Autowired
    AwardRepo awardRepo;
    @Autowired
    AwarderRepos awarderRepos;
    @RequestMapping("/listRecipientsAndAwards")
    public String listRecipients(Model model) {
        var listRecipientsAndAwards = listRecipientsAndAwardsRepos.findAll();
        model.addAttribute("listRecipientsAndAwards", listRecipientsAndAwards);
        return "list-recipients-and-awards";
    }

    @RequestMapping(value = "/listRecipientsAndAwards/delete/{id}", method = RequestMethod.GET)
    public String deleteAwarded(@PathVariable(value = "id") Long id,
                                Model model) {
        try {
            var del = listRecipientsAndAwardsRepos.findById(id).get();
            listRecipientsAndAwardsRepos.delete(del);
            return "redirect:/listRecipientsAndAwards";
        }
        catch (Exception ex) {
            String errorMessage = ex.getMessage();
            model.addAttribute("errorMessage", errorMessage);
            return "add-list-recipients-and-awards";
        }

    }

    @RequestMapping(value = "/listRecipientsAndAwards/add", method = RequestMethod.GET)
    public String addlistRecipientsAndAwards(
            Model model) {

            model.addAttribute("model", new listRecipientsAndAwards());
        return "add-list-recipients-and-awards";
    }

    @RequestMapping(value = "/listRecipientsAndAwards/add", method = RequestMethod.POST)
    public String addlistRecipientsAndAwardsSubmit(@ModelAttribute listRecipientsAndAwards recipientModel,
                                                   Model model) {
        try
        {
            var award = awardRepo.findById(Long.valueOf((recipientModel.getAward().getId()))).get();
            var awarded = awarderRepos.findById(Long.valueOf((recipientModel.getAwarder().getId()))).get();
            var item = new listRecipientsAndAwards();
            item.setAwarder(awarded);
            item.setAward(award);
            listRecipientsAndAwardsRepos.save(item);
            return "redirect:/listRecipientsAndAwards";
        }
        catch (Exception ex) {
            String errorMessage = ex.getMessage();
            model.addAttribute("errorMessage", errorMessage);
            return "add-list-recipients-and-awards";
        }
    }
}
