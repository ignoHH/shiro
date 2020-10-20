package com.example.shiro.controller;

import com.example.shiro.common.exception.ServiceException;
import com.example.shiro.common.exception.UserInputException;
import com.example.shiro.utils.Results;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Project：shiro
 * Date：2020/10/20
 * Time：17:30
 * Description：
 *
 * @author ignoHH
 * @version 1.0
 */
@Slf4j
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler({UserInputException.class})
    @ResponseBody
    public ResponseEntity userInputException(UserInputException e) {
        log.warn(e.getMessage());
        return Results.userInputError(e.getMessage());
    }

    @ExceptionHandler({ServiceException.class})
    @ResponseBody
    public ResponseEntity serviceException(ServiceException e) {
        log.error("未知错误", e);
        return Results.error("未知错误");
    }
}