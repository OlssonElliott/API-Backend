package com.api_backend.api_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Meal {

    @Id
    private int id; // alla objekt har redan ett id, behöver inte generera unika id:n
    private String source;
    private String comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
