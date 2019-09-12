package com.SetterInjection;

import com.example.Answer;
import com.example.nonString.User;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ping {
    private int id ;
    private  String name;
    private Map<Updates, Follower> ping;

    public Map<Updates, Follower> getPing() {
        return ping;
    }

    public void setPing(Map<Updates, Follower> ping) {
        this.ping = ping;
    }

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



    public void displayInfo() {
        System.out.println("ping id: " + id  );
        System.out.println("ping name :" + name);
        System.out.println("Ping Info");
        Set<Map.Entry<Updates,Follower>> set = ping.entrySet();
        Iterator<Map.Entry<Updates,Follower>> itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry<Updates, Follower> entry = itr.next();
            Updates updates = entry.getKey();
            Follower follower = entry.getValue();
            System.out.println("Update Information");
            System.out.println(updates);
            System.out.println("Posted By: ");
            System.out.println(follower);
        }


    }
}
