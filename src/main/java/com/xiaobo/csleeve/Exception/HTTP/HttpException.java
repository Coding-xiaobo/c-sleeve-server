package com.xiaobo.csleeve.Exception.HTTP;

public class HttpException extends RuntimeException{
    protected Integer code;
    protected Integer httpStatusCode = 500;
}
