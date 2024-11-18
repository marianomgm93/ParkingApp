/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.app.Parking.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author mariano
 */
@Controller
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio() {
       // model.addAttribute("attribute", "value");
        return "index";
    }
    
}
