package com.test.springboot.controller;

import javax.validation.Valid;

import com.test.springboot.data.audio;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @RequestMapping(value = "/input", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public String Get_data(@RequestBody @Valid audio audio_test) {
        return " " + audio_test.Get_sampleRateHertz();
    }

    
}
