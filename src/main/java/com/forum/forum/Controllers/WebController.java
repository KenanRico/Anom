package com.forum.forum.Controllers;

import com.forum.forum.Database.Model.Comment;
import com.forum.forum.Database.Service.DBService;
import com.forum.forum.Forms.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.util.ArrayList;
import java.util.List;


@Controller
public class WebController {

    @Autowired
    DBService service;

    public WebController(){
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String HomePage(){
        return "home.html";
    }

    @RequestMapping(value = "/forum", method = RequestMethod.GET)
    public String ForumPage(Model model) {
        ShowComments(model);
        return "forum.html";
    }

    @RequestMapping(value = "/forum", method = RequestMethod.POST)
    public String ForumSubmitMessage(@ModelAttribute Message msg, Model model) {
        System.out.println(msg.getAuthor()+" | "+msg.getContent()+" | "+msg.getDate().toString());
        Comment new_comment = new Comment();
        new_comment.SetInfo(msg.getAuthor(), msg.getContent(), msg.getDate());
        service.WriteComment(new_comment);
        ShowComments(model);
        return "forum.html";
    }

    @RequestMapping(value = "/battle", method = RequestMethod.GET)
    public String BattlePage(){
        return "battle_1.html";
    }

    private void ShowComments(Model model){
        List<String> authors = new ArrayList<>();
        List<String> messages = new ArrayList<>();
        List<Comment> comments = service.FindAllComments();
        for(Comment comment : comments){
            messages.add(comment.Message());
            authors.add(comment.Author());
        }
        model.addAttribute("authors", authors);
        model.addAttribute("messages", messages);
    }


}
