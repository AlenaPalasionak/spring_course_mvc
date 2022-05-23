package com.lenapalasionak.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

//этот класс будет обрабатывать аннотацию
public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> {// в дженериках указываем саму
    //аннотацию и тип данных, к которому мы будем применять аннотацию.(будем применять к строке email
    private String endOfEmail;//будет содержать часть имейла

    @Override
    public void initialize(CheckEmail checkEmail) {//в параметрах наша аннотация
        endOfEmail = checkEmail.value();//получили конец имейла
    }

    @Override
    public boolean isValid(String enteredValue, ConstraintValidatorContext constraintValidatorContext) {
        //enteredValue - то что будет вводиться в нашу форму
        return enteredValue.endsWith(endOfEmail);
    }
}
