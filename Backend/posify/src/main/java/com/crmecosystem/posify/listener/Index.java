package com.crmecosystem.posify.listener;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Index {
    
    @GetMapping("/web")
    public String index() {
        return "index.html";
    }

    @GetMapping("/mobile")
    public String mobileIndex(){
        return "mobile/index.html";
    }

    @GetMapping(value = "/login")
    public String login() {
        return "/index.html";
    }
}