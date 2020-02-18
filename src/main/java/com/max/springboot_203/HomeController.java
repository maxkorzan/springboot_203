package com.max.springboot_203;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @GetMapping("/carform")
    public String loadFormPage(Model model){
        model.addAttribute("car", new Car());
        return "carform";
    }

    @PostMapping("/carform")
    public String loadFromPage(@ModelAttribute Car car, Model model){
        model.addAttribute("car",car);
        return "confirmcar";
    }
}
