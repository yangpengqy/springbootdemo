package com.example.springbootdemo.exception;

import com.example.springbootdemo.polo.ResponseMessage;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@RestControllerAdvice
public class ExceptionHandlerAdvice {
    Logger logger = LoggerFactory.getLogger(ExceptionHandlerAdvice.class);

    @ExceptionHandler(Exception.class)
    public ResponseMessage handleException(Exception e, HttpServletRequest request, HttpServletResponse response) {
        logger.error("系统异常:", e);
        return new ResponseMessage(500, "error", null);
    }
}
