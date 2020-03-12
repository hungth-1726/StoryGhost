package com.example.storyghost.data.model;

public class Story {
    private String title;
    private String content;
    private String uri;
    private boolean isFavorite;

    public Story(String title, String content, String uri, boolean isFavorite) {
        this.title = title;
        this.content = content;
        this.uri = uri;
        this.isFavorite = isFavorite;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getUri() {
        return uri;
    }

    public boolean isFavorite() {
        return isFavorite;
    }
}
