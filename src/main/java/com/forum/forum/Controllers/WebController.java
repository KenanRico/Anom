package com.forum.forum.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.support.ModelAndViewContainer;


@Controller
public class WebController {

    public WebController(){}

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    @ResponseBody
    public String HomePage(){
        return "This is home jaja";
    }

    @RequestMapping(value = "/battle1", method = RequestMethod.GET)
    public String Battle_1(){
        return "battle1.html";
    }

}
