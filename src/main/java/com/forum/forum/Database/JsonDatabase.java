package com.forum.forum.Database;

import com.forum.forum.Forms.Message;
import org.json.JSONArray;
import org.json.JSONObject;

public class JsonDatabase {
    String handle;

    public JsonDatabase(String db_json_name){
        handle = db_json_name;
    }

    public void WriteMessage(Message msg){

        JSONObject message = new JSONObject();
        message.put("author", msg.getAuthor());
        message.put("content", msg.getContent());
        message.put("date", msg.getDate());


    }
}
