package pl.mg.carstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("greeting","Welcome to car store");
        model.addAttribute("tagline","The one and only amazing webstore");
        return "welcome";
    }
}
