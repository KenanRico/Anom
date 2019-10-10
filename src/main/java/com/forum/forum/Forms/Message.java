package com.forum.forum.Forms;

import java.time.LocalDate;

public class Message {
    private String author;
    private String content;
    private LocalDate date;

    public Message(){
        date = LocalDate.now();
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String _author){
        author = _author;
    }

    public String getContent(){
        return content;
    }
    public void setContent(String _content){
        content = _content;
    }

    public LocalDate getDate(){
        return date;
    }
}
