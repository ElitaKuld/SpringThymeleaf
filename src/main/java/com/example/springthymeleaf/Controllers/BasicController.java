package com.example.springthymeleaf.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BasicController {

    @RequestMapping("/helloWorld")
    public String helloWorld(@RequestParam String name, Model model){
        model.addAttribute("name",name);
        return "helloWorld.html";
    }

    @RequestMapping("/GreetingsEarthling")
    public String greeting(@RequestParam String planetName, int numberOfStars, Model model){
        model.addAttribute("planetName",planetName);
        model.addAttribute("numberOfStars",numberOfStars);
        return "greeting.html";
    }
}
