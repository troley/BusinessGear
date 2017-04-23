package com.renarcus.businessgear.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Troley on 23-4-2017
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Product doesn't exist.")
public class ProductNotFoundException extends RuntimeException {


}
