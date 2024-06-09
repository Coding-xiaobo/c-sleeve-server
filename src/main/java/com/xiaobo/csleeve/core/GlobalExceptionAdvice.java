package com.xiaobo.csleeve.core;

import com.xiaobo.csleeve.Exception.http.HttpException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 处理全局异常
 */
@ControllerAdvice
public class GlobalExceptionAdvice {
    //处理未知异常
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    @ResponseStatus(code= HttpStatus.INTERNAL_SERVER_ERROR)
    public UnifyResponse handleException(HttpServletRequest req, Exception e) {
        String requestUrl = req.getRequestURI();
        String method = req.getMethod();
        System.out.println(e);
        //未知异常code码统一设置为9999
        UnifyResponse msg = new UnifyResponse(9999,"服务器异常", method+" "+requestUrl);
        return msg;
    }
    //处理已知异常
    @ExceptionHandler(HttpException.class)
    public ResponseEntity<UnifyResponse> handleHttpException(HttpServletRequest req, HttpException e) {
        String requestUrl = req.getRequestURI();
        String method = req.getMethod();
        UnifyResponse msg = new UnifyResponse(e.getCode(), "xxxx", method+" "+requestUrl);
        //headers是为了设置返回的类型
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        //httpStatus
        HttpStatus status = HttpStatus.resolve(e.getCode());
        ResponseEntity<UnifyResponse> r = new ResponseEntity<>(msg, headers, status);
        return r;
    }
}
