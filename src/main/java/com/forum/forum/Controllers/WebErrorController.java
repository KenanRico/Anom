package com.forum.forum.Controllers;

import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebErrorController implements ErrorController {

    private ErrorAttributes error_attributes;
    private final static String error_path = "/error";


    /*
     * TODO: include tomcat?
     */
    @RequestMapping(value=error_path, produces = "text/html")
    public String ErrorHTML(){
        return "error.html";
    }

    @Override
    public String getErrorPath(){
        return error_path;
    }
}
