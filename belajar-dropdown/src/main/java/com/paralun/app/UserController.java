package com.paralun.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private DropdownItemProperties dropdownItemProperties;

    @Autowired
    private RadioButtonProperties radioButtonProperties;

    @RequestMapping("/")
    public String index(User user, Model model){
        model.addAttribute("user", new User());
        return "index";
    }

    @ModelAttribute("userRoleOptions")
    public Map<String, String> getUserRoleOptions() {
        return dropdownItemProperties.getUserRoleOptions();
    }

    @ModelAttribute("statusOptions")
    public Map<String, String> getStatusOptions() {
        return radioButtonProperties.getStatusOptions();
    }
}
