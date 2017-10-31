package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String homePage(Model model)
    {
        String myvar="this is myfirst class";
        //model.addAttribute("myvar","this is myfirst class");
        model.addAttribute("myvar",myvar);

        return  "hometemplete";
    }
}
