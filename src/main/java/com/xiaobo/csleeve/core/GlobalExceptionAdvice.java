package com.xiaobo.csleeve.core;

import com.xiaobo.csleeve.Exception.http.HttpException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * 处理全局异常
 */
@ControllerAdvice
public class GlobalExceptionAdvice {
    @ExceptionHandler(value = Exception.class)
    public void handleException(HttpServletRequest req, Exception e) {
        System.out.println("hello");
    }
    @ExceptionHandler(HttpException.class)
    public void handleHttpException(HttpServletRequest req, HttpException e) {
        System.out.println("hello");
    }
}
