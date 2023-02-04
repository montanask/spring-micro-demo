package org.montana.micro.demo.eurekaclient2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ihor Sukalin on 02.02.2023
 *
 * @author : Ihor Sukalin
 * date : 02.02.2023
 * project : spring-micro-demo
 */

@RestController
@RequestMapping("/main")
public class DemoController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Buenos Noches";
    }
}
