package com.pits.auction.global.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {


    @RequestMapping("/")
    public String index(Model model){

        model.addAttribute("team", "Pearl in the Soil");

        return "plMain";
    }


    @RequestMapping("/plNav")
    public String nav(Model model){

        model.addAttribute("team", "Pearl in the Soil");

        return "plNav";
    }



}
