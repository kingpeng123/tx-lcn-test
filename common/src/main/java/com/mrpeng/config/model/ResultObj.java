package com.mrpeng.config.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 *controller通过返回结果对象
 */
@ApiModel(description = "通用返回实体类")
@Data
public class ResultObj<T> {
    public static final int OK = 200;

    public static final int BAD_REQUEST = 400;

    public static final int NO_AUTH = 401;

    public static final int NOT_FOUND = 404;

    public static final int NOT_ACCEPTABLE = 406;

    public static final int ERROR = 500;

    public static final String SERVER_ERROR_MSG = "服务器异常,请联系管理员!";

    public static final String NOT_FOUND_MSG = "未找到符合条件的数据";
    // 返回码，200正常，500异常
    @ApiModelProperty(value = "响应状态码：200-- 成功，400 --参数不合法，401 --权限认证失败,404--资源不存在,406--请求拒绝, 500-- 服务器异常")
    private int resultCode;
    // 多页查询相关
    // 第几页
    @ApiModelProperty(value = "返回消息")
    private String resultMsg;
    // 返回的数据
    @ApiModelProperty(value = "返回数据对象1（常用）")
    private T resultObj;

    // 返回的数据
    @ApiModelProperty(value = "返回数据对象2（分页获取）")
    private Object resultObj2;

    public ResultObj(){}

    public ResultObj(int code) {
        this.setResultCode(code);
    }

    public static ResultObj ok (){
        ResultObj obj =new ResultObj();
        obj.setResultCode(ResultObj.OK);
        obj.setResultMsg("操作成功");
        return obj;
    }

    public static ResultObj error (){
        ResultObj obj =new ResultObj();
        obj.setResultCode(ResultObj.ERROR);
        obj.setResultMsg("操作失败");
        return obj;
    }

    public static ResultObj unAuth(){
        ResultObj obj =new ResultObj();
        obj.setResultCode(ResultObj.NO_AUTH);
        obj.setResultMsg("授权失败");
        return obj;
    }

    public ResultObj(int code, T obj) {
        this.setResultCode(code);
        this.setResultObj(obj);
    }

    public ResultObj code(int code){
        this.resultCode =code;
        return this;
    }
    public ResultObj message(String message){
        this.resultMsg =message;
        return this;
    }
    public ResultObj data(T data){
        this.resultObj =data;
        return this;
    }
    public ResultObj data2(Object data){
        this.resultObj2 =data;
        return this;
    }

}
