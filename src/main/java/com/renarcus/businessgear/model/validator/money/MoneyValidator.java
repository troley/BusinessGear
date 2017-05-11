package com.renarcus.businessgear.model.validator.money;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by Troley on 22-4-2017
 */
public class MoneyValidator implements ConstraintValidator<Money, Double> {

    public void initialize(Money money) {}

    public boolean isValid(Double money, ConstraintValidatorContext context) {
        String cash = Double.toString(money);

        if (cash != null && !cash.matches("\\d+([.]\\d{2})?")) {
            context.disableDefaultConstraintViolation();
            return false;
        }

        return true;
    }
}
