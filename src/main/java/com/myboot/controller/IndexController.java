package com.myboot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author fstar
 */
@Controller
@EnableAutoConfiguration
public class IndexController {

    @GetMapping("/")
    @ResponseBody
    public String index(){
        return "Good good study";
    }


}
