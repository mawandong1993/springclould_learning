package com.learning.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mawandong
 * @date 2019/3/22 23:43
 */
@RestController
@RequestMapping("/cfg")
public class ConfigController {

    @Value("${foo}")
    String foo;

    @Value("${bar}")
    String bar;

    @RequestMapping(value = "/foo")
    public String foo(){
        return foo + "——" + bar;
    }

}
