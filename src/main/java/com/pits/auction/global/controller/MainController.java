package com.pits.auction.global.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {


    @RequestMapping("/")
    public String index(Model model){

        model.addAttribute("team", "Pearl in the Soil");

        return "index";
    }

}
