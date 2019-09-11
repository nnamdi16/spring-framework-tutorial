package com.SetterInjection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Setter Injection with Map Example
public class Post {
    private int id ;
    private  String name;
    private Map<String,String> post;

    public Map<String, String> getPost() {
        return post;
    }

    public void setPost(Map<String, String> post) {
        this.post = post;
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
        System.out.println("post id: " + id  );
        System.out.println("post name :" + name);
        System.out.println("Answers are");
       Set<Map.Entry<String,String>> set = post.entrySet();
       Iterator<Map.Entry<String,String>> itr = set.iterator();
       while (itr.hasNext()) {
           Map.Entry<String, String> entry = itr.next();
           System.out.println("Answer: " + entry.getKey()+ " Posted By:" + entry.getValue());
       }


    }
}
