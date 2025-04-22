package com.neel.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    private String x;


    // api calling in "/"
    @RequestMapping("/")
    public String index(){
        System.out.println("appName: "+x);
        System.out.println("appName: yo");
        System.out.println("appName: hehe");
        return "index.html";
    }
}
