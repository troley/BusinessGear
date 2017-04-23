package com.renarcus.businessgear.model.validator;

import com.renarcus.businessgear.model.Product;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by Troley on 22-4-2017
 */
public class ProductValidator implements Validator {

    public boolean supports(Class<?> aClass) {
        return Product.class.equals(aClass);
    }

    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "error.name", "Product name is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "price", "error.price", "Product price must be at least 0.00.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "category", "error.category", "Category must be chosen.");
    }
}
