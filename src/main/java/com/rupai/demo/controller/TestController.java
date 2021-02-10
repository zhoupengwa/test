package com.rupai.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoupeng
 */
@RestController
@RequestMapping("/api/test")
public class TestController {


    @GetMapping("/test")
    public String test() {
        return "hello world!";
    }


}
