package com.renarcus.businessgear.model.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by Troley on 22-4-2017
 */
public class MoneyValidator implements ConstraintValidator<Money, String> {

    public void initialize(Money money) {}

    public boolean isValid(String money, ConstraintValidatorContext constraintValidatorContext) {
        return money != null && money.matches("\\d+([.]\\d{2})?");
    }
}
