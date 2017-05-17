package com.renarcus.businessgear.model.validator.phone;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by troley on 11-5-17.
 */
@Documented
@Constraint(validatedBy = PhoneValidator.class)
@Target( {ElementType.FIELD, ElementType.METHOD} )
@Retention(RetentionPolicy.RUNTIME)
public @interface Phone {

    String message() default "{com/renarcus/businessgear/model/validator/phone/Phone.java" + "message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
