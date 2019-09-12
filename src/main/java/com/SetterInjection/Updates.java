package com.SetterInjection;

import com.example.Answer;

import java.util.Date;

public class Updates {
    private int id;
    private String updates;
    private Date postedDate;
    public Updates() {}
    public Updates(int id, String updates, Date postedDate) {
        this.id = id;
        this.updates = updates;
        this.postedDate = postedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUpdates() {
        return updates;
    }

    public void setUpdates(String updates) {
        this.updates = updates;
    }

    public Date getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(Date postedDate) {
        this.postedDate = postedDate;
    }

    public String toString() {
        return "id: " + id + " Updates: " + updates + "Posted Date: " + postedDate;
    }
}
