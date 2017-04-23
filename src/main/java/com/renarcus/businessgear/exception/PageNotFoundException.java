package com.renarcus.businessgear.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Troley on 23-4-2017
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "The page you are looking for was not found.")
public class PageNotFoundException extends RuntimeException {

}
