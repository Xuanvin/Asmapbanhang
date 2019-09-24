package com.example.asmapbanhang;

import android.widget.ImageView;

public class Note {
    private String title;
    private  String description;
    private int priority;
    private String img;

    public Note () {
        //empty constructor needed
    }

    public Note(String title, String description ,int priority, String img){
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.img = img;
    }
    public Note(String title, String description ,int priority){
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
