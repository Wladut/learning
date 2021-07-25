package com.vladutvrinceanu;

public class Song {
    private String title;
    private String duration;

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Song(String title, String duration) {
        this.title = title;
        this.duration = duration;
    }
}
