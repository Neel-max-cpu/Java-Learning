package com.neel.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    // api calling in "/"
    @RequestMapping("/")
    public String index(){
        return "index.html";
    }
}
