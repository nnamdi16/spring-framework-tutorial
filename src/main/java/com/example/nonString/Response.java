package com.example.nonString;

import java.util.Date;

public class Response {
    private  int id;
    private String answer;
    private Date postedDate;
    public Response() {}
    public Response(int id, String answer, Date postedDate)  {
        this.id = id;
        this.answer = answer;
        this.postedDate = postedDate;

    }

    public String toString() {
        return "Id " + id  + " Answer: " + answer + " Posted Date: " + postedDate;
    }

}
