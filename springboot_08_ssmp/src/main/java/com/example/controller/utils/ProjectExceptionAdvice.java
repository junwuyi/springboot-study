package com.example.controller.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * springmvc 的异常处理器
 *
 * @author chenjianbing
 * @create 2021-11-07 20:48
 */
//@ControllerAdvice
@RestControllerAdvice
public class ProjectExceptionAdvice {

    //拦截所有的异常信息
    @ExceptionHandler(Exception.class)
    public R doException(Exception ex) {
        // 记录日志
        // 发送消息给运维
        // 发送邮件给开发人员 ,ex 对象发送给开发人员
        ex.printStackTrace();
        return new R(false, null, "系统错误，请稍后再试！");
    }
}
