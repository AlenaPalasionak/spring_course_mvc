package com.lenapalasionak.spring.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)// инф. сохранится до выполнения кода
@Constraint(validatedBy = CheckEmailValidator.class)//указываем класс, который создадим для того, чтобы описать бизнес логику аннотации
public @interface CheckEmail {

    public String value() default "xyz.com";

    public String message() default "email must ends with xyz.com";

    public Class<?>[] groups() default {};//для разбиения аннотаций по группам

    public Class<? extends Payload>[] payload() default {};// для переноса инфы о метаданных клиента
}
