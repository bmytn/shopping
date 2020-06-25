package com.softserveinc.retail.shopping.rest;

import com.softserveinc.retail.shopping.DishNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Dish with such id not found")
    @ExceptionHandler(DishNotFoundException.class)
    public void dishNotFoundExceptionHandler(){

    }
}
