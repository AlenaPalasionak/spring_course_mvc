package com.lenapalasionak.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")//При вводе в браузере слэша - будет выводиться возвр. view со именем first view
    // а там I wish you luck in Spring MVC learning
    public String showFirstView() {
        return "first-view";
    }
}
