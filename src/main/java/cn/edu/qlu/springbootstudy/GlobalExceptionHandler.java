package cn.edu.qlu.springbootstudy;

import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BindException.class)
    public String handerValidException(BindException e){
        String msg = e.getFieldError().getDefaultMessage();
        return "参数校验失败：" + msg;
    }
}
