package com.jm.modules.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jm.modules.test.service.TestService;
import com.jm.utils.ResponseInfo;

@RestController
@RequestMapping("/demo")
public class TestController {

    @Autowired
    private TestService testService;


    @RequestMapping("/test")
    public ResponseInfo test(){
    	testService.test();
        return ResponseInfo.ok("yes...");

    }

}
