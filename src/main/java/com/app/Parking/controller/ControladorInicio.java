package com.app.Parking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControladorInicio {

    @GetMapping("/")
    public String inicio() {
        // model.addAttribute("attribute", "value");
        return "index";
    }

}
