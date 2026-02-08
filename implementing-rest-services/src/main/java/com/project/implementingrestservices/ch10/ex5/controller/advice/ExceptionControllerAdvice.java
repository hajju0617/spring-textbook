package com.project.implementingrestservices.ch10.ex5.controller.advice;


import com.project.implementingrestservices.ch10.ex5.exception.NotEnoughMoneyException5;
import com.project.implementingrestservices.ch10.ex5.model.ErrorDetails5;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(NotEnoughMoneyException5.class)
    public ResponseEntity<ErrorDetails5> exceptionNotEnoughMoneyHandler() {
        ErrorDetails5 errorDetails = new ErrorDetails5();
        errorDetails.setMessage("Not enough money to make the payment");
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(errorDetails);
    }
}
