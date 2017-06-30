package com.renarcus.businessgear.model.validator.phone;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by troley on 11-5-17.
 */
public class PhoneValidator implements ConstraintValidator<Phone, String> {

    public void initialize(Phone phone) {}

    public boolean isValid(String phonenr, ConstraintValidatorContext constraintValidatorContext) {
        // string between 10-15 digits (e.g. +316 ... 06 ... foreign tel. numbers etc.)
        return phonenr != null && phonenr.matches("(\\d{10,15})");
    }
}
