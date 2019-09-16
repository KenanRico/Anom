package com.forum.forum.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.support.ModelAndViewContainer;


@Controller
public class WebController {

    public WebController(){}

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String HomePage(){
        return "home.html";
    }

    @RequestMapping(value = "/forum", method = RequestMethod.GET)
    public String ForumPage() {
        return "forum.html";
    }

    @RequestMapping(value = "/battle", method = RequestMethod.GET)
    public String BattlePage(){
        return "battle_1.html";
    }

}
