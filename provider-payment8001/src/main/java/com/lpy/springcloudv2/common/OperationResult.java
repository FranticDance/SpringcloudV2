package com.lpy.springcloudv2.common;

/**
 * @author lpy
 * @version 1.0
 * @date 2020/4/26 1:01
 */
public enum OperationResult {
    SUCCESS(200, "操作成功"),
    FAIL(444, "操作失败");

    private Integer code;
    private String message;

    OperationResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
