package com.crmecosystem.posify.listener;

import org.springframework.boot.webmvc.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CustomError implements ErrorController {

    @GetMapping("/error")   
    public String redirectRoot() {
        return "redirect:/";
    }
}