package org.montana.micro.demo.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ihor Sukalin on 02.02.2023
 *
 * @author : Ihor Sukalin
 * date : 02.02.2023
 * project : spring-micro-demo
 */

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
