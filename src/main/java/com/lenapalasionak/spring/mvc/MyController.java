package com.lenapalasionak.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {

    //чтобы вызвать нужно написать http://localhost:8080/employee/
    @RequestMapping("/")//При вводе в браузере слэша - будет выводиться возвр. view с именем first view
    // а там I wish you luck in Spring MVC learning
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmpDetails(Model model) {
        model.addAttribute("employee", new Employee());//с этим атрибутом будет работать view
        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult) {//view этого метода может использовать
        // атрибут под названием employee. Из него и возьмет информацию. @Valid - атрибут employee будет подвергаться проверки
//результат валидации будет помещен в bindingResult
        if (bindingResult.hasErrors()) {
            return "ask-emp-details-view";
        } else {
            return "show-emp-details-view";
        }

    }
}
