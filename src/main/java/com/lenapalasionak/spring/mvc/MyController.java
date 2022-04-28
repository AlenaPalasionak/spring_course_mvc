package com.lenapalasionak.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employee")
public class MyController {

    //чтобы вызвать нужно написать http://localhost:8080/employee/
    @RequestMapping("/")//При вводе в браузере слэша - будет выводиться возвр. view со именем first view
    // а там I wish you luck in Spring MVC learning
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmpDetails() {
        return "ask-emp-details-view";
    }


    @RequestMapping("/showDetails")
    public String showEmpDetails(@RequestParam("employeeName") String empName
            , @RequestParam("age") String age, Model model) {

        empName = " Mrs " + empName+".";
        model.addAttribute("nameAttribute", empName);

        age = " " + age +" years";
        model.addAttribute("age", age);

        return "show-emp-details-view";
    }
}
