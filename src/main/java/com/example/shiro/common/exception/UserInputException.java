package com.example.shiro.common.exception;

/**
 * Project：shiro
 * Date：2020/10/20
 * Time：17:29
 * Description：
 *
 * @author ignoHH
 * @version 1.0
 */
public class UserInputException extends RuntimeException {
    public UserInputException(String message) {
        super(message);
    }
}