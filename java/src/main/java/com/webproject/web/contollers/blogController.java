package com.webproject.web.contollers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class blogController {
    @GetMapping("/blog")
    public String blog( Model model){
        model.addAttribute("title", "Blog");
        return "blog";
    }
}
