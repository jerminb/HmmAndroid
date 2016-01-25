package com.hmm.viewmodels;

/**
 * Created by code1 on 25/01/16.
 */
public class Feed {
    private String id;
    private String title;

    public Feed(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
