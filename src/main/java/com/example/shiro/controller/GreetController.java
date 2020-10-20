package com.example.shiro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project：shiro
 * Date：2020/10/20
 * Time：17:21
 * Description：
 *
 * @author ignoHH
 * @version 1.0
 */
@RestController
public class GreetController {

    @GetMapping("/")
    public String greet() {
        return "hello world";
    }
}
