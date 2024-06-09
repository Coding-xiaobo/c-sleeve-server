package com.xiaobo.csleeve.core;

import com.xiaobo.csleeve.Exception.http.HttpException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 处理全局异常
 */
@ControllerAdvice
public class GlobalExceptionAdvice {
    //处理未知异常
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public UnifyResponse handleException(HttpServletRequest req, Exception e) {
        //未知异常code码统一设置为9999
        UnifyResponse msg = new UnifyResponse(9999,"服务器异常", "URL");
        return msg;
    }
    //处理已知异常
//    @ExceptionHandler(HttpException.class)
//    public void handleHttpException(HttpServletRequest req, HttpException e) {
//        System.out.println("hello");
//    }
}
