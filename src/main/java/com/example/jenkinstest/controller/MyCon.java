package com.example.jenkinstest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: com.example.jenkinstest.controller.MyCon
 * @description:
 * @author: Mr.BULLET
 * @create: 2019-11-28 10:29
 */
@RestController
public class MyCon {
    @RequestMapping("/a")
    public String aaa(){
        return "傻逼窦佳顺";
    }

}
