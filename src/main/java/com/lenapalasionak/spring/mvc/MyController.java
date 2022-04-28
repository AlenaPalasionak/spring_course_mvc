package com.lenapalasionak.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    @RequestMapping("/")//При вводе в браузере слэша - будет выводиться возвр. view со именем first view
    // а там I wish you luck in Spring MVC learning
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmpDedails() {
        return "ask-emp-details-view";
    }

    //    @RequestMapping("/showDetails")
//    public String showEmpDedails() {
//        return "show-emp-details-view";
//    }
//    @RequestMapping("/showDetails")
//    public String showEmpDedails(HttpServletRequest request, Model model) {
//
//        String empName = request.getParameter("employeeName");
//        empName = "Mrs " + empName;
//        model.addAttribute("nameAttribute", empName);
//
//        return "show-emp-details-view";
//    }
    @RequestMapping("/showDetails")
    public String showEmpDedails(@RequestParam("employeeName") String empName, Model model) {

        empName = "Mrs " + empName;
        model.addAttribute("nameAttribute", empName);

        return "show-emp-details-view";
    }
}
