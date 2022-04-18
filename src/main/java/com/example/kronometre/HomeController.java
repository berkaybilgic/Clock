package com.example.kronometre;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home(){
        return "redirect:/kronometre";
    }




    @RequestMapping(value = "/kronometre")
    public String sayac(){
        return "kronometre";
    }


}
