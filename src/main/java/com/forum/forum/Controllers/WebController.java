package com.forum.forum.Controllers;

import com.forum.forum.Database.JsonDatabase;
import com.forum.forum.Forms.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.support.ModelAndViewContainer;


@Controller
public class WebController {

    JsonDatabase msg_db;

    public WebController(){
        msg_db = new JsonDatabase("Messages.json");
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String HomePage(){
        return "home.html";
    }

    @RequestMapping(value = "/forum", method = RequestMethod.GET)
    public String ForumPage(Model model) {
        model.addAttribute("message", new Message());
        return "forum.html";
    }

    @RequestMapping(value = "/forum", method = RequestMethod.POST)
    public String ForumSubmitMessage(@ModelAttribute Message msg) {
        System.out.println(msg.getAuthor()+" | "+msg.getContent()+" | "+msg.getDate().toString());
        msg_db.WriteMessage(msg);
        return "forum.html";
    }

    @RequestMapping(value = "/battle", method = RequestMethod.GET)
    public String BattlePage(){
        return "battle_1.html";
    }

}
