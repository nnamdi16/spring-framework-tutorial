package com.SetterInjection;

import com.example.Answer;

import java.util.Iterator;
import java.util.List;

public class Issues {
    private int id ;
    private  String name;
    private List<Reply> reply;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Reply> getReply() {
        return reply;
    }

    public void setReply(List<Reply> reply) {
        this.reply = reply;
    }

    public void displayInfo() {
        System.out.println(id + " " + name );
        System.out.println("Answers are");
        Iterator<Reply> itr = reply.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
