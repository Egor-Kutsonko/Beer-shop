package com.beer.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
    private static final String SUCCESS="success";

    @GetMapping
    public String test(){
        return SUCCESS;
    }
}
