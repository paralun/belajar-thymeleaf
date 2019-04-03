package com.paralun.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("command", new FormCommand());
        return "index";
    }

    @PostMapping("/hasil")
    public String hasil(FormCommand command, Model model) {
        model.addAttribute("command", command);
        return "hasil";
    }

    @ModelAttribute("multiCheckboxAllValues")
    public String[] getMultiCheckboxAllValues() {
        return new String[] {
                "Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"
        };
    }

    @ModelAttribute("singleSelectAllValues")
    public String[] getRadioButton() {
        return new String[] {
               "YES", "NO", "MAYBE"
        };
    }
}
