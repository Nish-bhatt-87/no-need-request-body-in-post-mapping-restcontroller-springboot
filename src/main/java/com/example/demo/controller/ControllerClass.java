package com.example.demo.controller;

import com.example.demo.pojo.JsonObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ControllerClass {


    @RequestMapping(value = "/{ip}/cameras", method = RequestMethod.POST)
    public void printShit(JsonObject jsonObject, String nishubro,@PathVariable String ip) {
        System.out.println(jsonObject.getKey());
        System.out.println(jsonObject.getLock());
        System.out.println(nishubro);
        System.out.println(ip);
    }
}
