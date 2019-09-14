package com.forum.forum.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WebController {

    public WebController(){}

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String GetKey(){
        return "This is home";
    }

}