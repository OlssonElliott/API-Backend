package com.api_backend.api_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Meal {

    @Id
    private Integer id; // alla objekt har redan ett id, behöver inte generera unika id:n
    private String source;
    private String comment;
    private boolean favorite;

    public Meal(Integer id, String source, String comment, boolean favorite) {
        this.id = id;
        this.source = source;
        this.comment = comment;
        this.favorite = favorite;
    }

    public Meal() {

    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
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
