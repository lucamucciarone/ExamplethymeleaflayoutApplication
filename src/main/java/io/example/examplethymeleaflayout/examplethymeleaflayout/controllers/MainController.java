package io.example.examplethymeleaflayout.examplethymeleaflayout.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("page1")
    public String getPage1(){
        return "page1";
    }

    @RequestMapping("page2")
    public String getPage2(){
        return "page2";
    }
}
