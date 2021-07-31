package com.mrpeng.config.model.myenum;

/**
 * 请求状态码
 * @author: pqq
 * @create: 2021-03-03 12:25
 **/

public enum  HttpStatus {

    OK(200,"请求成功！"),
    BAD_REQUEST(400,"参数不合法！"),
    NO_AUTH(401,"权限认证失败！"),
    NOT_FOUND(404,"资源不存在！"),
    NOT_ACCEPTABLE(406,"请求拒绝！"),
    ERROR(500,"服务器异常！"),
    FEIGN_ERROR(507,"服务调用失败！");
    private int code;
    private String message;
    HttpStatus(int code,String message){
        this.code=code;
        this.message =message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
