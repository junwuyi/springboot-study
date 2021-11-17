package com.example.controller.bak;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author chenjianbing
 * @create 2021-11-17 18:46
 */
public class BaseClass {
    private Class clazz;
    public static Logger log;

    public BaseClass() {
        clazz = this.getClass();
        log = LoggerFactory.getLogger(clazz);
    }

}