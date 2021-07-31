package com.mrpeng.config.globalhandler;


import com.mrpeng.config.exception.service.NotAcceptException;
import com.mrpeng.config.exception.service.NotFoundException;
import com.mrpeng.config.exception.service.ServiceException;
import com.mrpeng.config.model.ResultObj;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.nio.file.AccessDeniedException;
import java.security.InvalidParameterException;

@ControllerAdvice(basePackages = {  "com.mrpeng.a.controller",
                                    "com.mrpeng.b.controller",
                                    "com.mrpeng.c.controller",
                                })
@Slf4j
public class GlobalExceptionHandler extends RuntimeException {

    private static String SERVER_ERROR_MSG ="服务器错误，请联系管理员！";

    /**
     * 资源未找到异常
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = NotFoundException.class)
    @ResponseBody
    public ResultObj handleNotFound(NotFoundException e) throws Exception {
        ResultObj resObj = new ResultObj();
        resObj.setResultCode(ResultObj.NOT_FOUND);
        resObj.setResultObj(e.getMessage());
        return resObj;
    }

    /**
     * 参数校验异常
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = InvalidParameterException.class)
    @ResponseBody
    public ResultObj handlerParameterException(InvalidParameterException e) throws Exception {
        log.info("Error in parameter,reason:{}",e.getMessage());
        ResultObj resObj = new ResultObj();
        resObj.setResultCode(ResultObj.BAD_REQUEST);
        resObj.message("系统参数异常，请联系管理员");
        return resObj;
    }

    /**
     * 请求被拒绝
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = NotAcceptException.class)
    @ResponseBody
    public ResultObj handlerNotAcceptException(NotAcceptException e) throws Exception {

        ResultObj resObj = new ResultObj();
        resObj.setResultCode(ResultObj.BAD_REQUEST);
        resObj.message(SERVER_ERROR_MSG);
        return resObj;
    }

    /**
     * 未登录
     * @param e
     * @return
     * @throws ServiceException
     */
    @ExceptionHandler(value = AccessDeniedException.class)
    @ResponseBody
    public ResultObj unAccessDeniedHandler(AccessDeniedException e) throws Exception {
        log.error("服务器出现异常!");
        e.printStackTrace();
        ResultObj resObj = new ResultObj();
        resObj.setResultCode(ResultObj.NO_AUTH);
        resObj.message("未登录！！！");
        return resObj;
    }

    @ExceptionHandler(value = ServiceException.class)
    @ResponseBody
    public ResultObj handlerServiceException(ServiceException e) throws Exception {
        log.error("server error,reason:{}",e.getMessage());
        e.printStackTrace();
        ResultObj resObj = new ResultObj();
        resObj.setResultCode(ResultObj.ERROR);
        resObj.message(e.getMessage());
        return resObj;
    }



    /**
     * 服务器其他异常
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultObj handlerOtherException(Exception e){
        log.error("{}",e.getMessage());
        e.printStackTrace();
        ResultObj resObj = new ResultObj();
        resObj.setResultCode(ResultObj.ERROR);
        resObj.message(ResultObj.SERVER_ERROR_MSG);
        return resObj;
    }




}
