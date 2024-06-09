package com.xiaobo.csleeve.Exception.http;

public class HttpException extends RuntimeException{
    protected Integer code;
    protected Integer httpStatusCode = 500;
}
