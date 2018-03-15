package org.ec.utils;

import org.ec.utils.exception.BusinessException;
import org.springframework.context.NoSuchMessageException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;

@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 处理所有不可知的异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    JSONResult handleException(Exception e) {
        String errCode = "";
        String message = e.getMessage();

        return new JSONResult<HashMap>(errCode, message);
    }

    /**
     * 处理所有业务异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    JSONResult handleBusinessException(BusinessException e) {
        String errCode = e.getErrorCode();
        String message = e.getMessage();

        return new JSONResult<HashMap>(errCode, message);
    }


    /**
     * 处理所有业务异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(NoSuchMessageException.class)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    JSONResult handleNoSuchMessageException(NoSuchMessageException e) {
        String errCode = "0";
        String message = "服务异常 NoSuchMessageException";

        return new JSONResult<HashMap>(errCode, message);
    }
}
