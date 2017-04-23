package com.renarcus.businessgear.model.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = MoneyValidator.class)
@Target( {ElementType.METHOD, ElementType.FIELD} )
@Retention(RetentionPolicy.RUNTIME)
public @interface Money {

    String message() default "{com/renarcus/businessgear/model/validator/Money.java" + "message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
