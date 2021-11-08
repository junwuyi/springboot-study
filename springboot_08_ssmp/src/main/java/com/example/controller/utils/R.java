package com.example.controller.utils;

import lombok.Data;

/**
 * @author chenjianbing
 * @create 2021-11-07 17:14
 */
@Data
public class R {
    private Boolean flag;
    private Object data;
    private String msg;

    public R() {
    }

    /**
     * 不返回数据的构造方法
     *
     * @param flag
     */
    public R(Boolean flag) {
        this.flag = flag;
    }

    /**
     * 返回数据的构造方法
     *
     * @param flag
     * @param data
     */
    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    /**
     * 带消息的构造方法
     *
     * @param flag
     * @param msg
     */
    public R(Boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

    public R(String msg) {
        this.flag = false;
        this.msg = msg;
    }

    public R(Boolean flag, Object data, String msg) {
        this.flag = flag;
        this.data = data;
        this.msg = msg;
    }


}
