package com.yimo.Controller;

import com.yimo.Exception.CustomException;
import com.yimo.Exception.ErrorResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ErrorResponseEntity customExceptionHandler(HttpServletRequest request,
                                                      final Exception e,
                                                      HttpServletResponse response){

        response.setStatus(HttpStatus.BAD_REQUEST.value());
        CustomException exception = (CustomException) e;

        return new ErrorResponseEntity(exception.getCode(),exception.getMessage());
    }


    /**
     * RuntimeException
     * @param request
     * @param e
     * @param response
     * @return 响应结果
     */
    @ExceptionHandler(RuntimeException.class)
    public ErrorResponseEntity runtimeExceptionHandler(HttpServletRequest request, final Exception e, HttpServletResponse response) {
        response.setStatus(HttpStatus.BAD_REQUEST.value());
        RuntimeException exception = (RuntimeException) e;

        return new ErrorResponseEntity(400, exception.getMessage());
    }



}
