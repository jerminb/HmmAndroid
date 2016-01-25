package com.hmm.viewmodels;

/**
 * Created by code1 on 25/01/16.
 */
public class TextFeed extends Feed {
    private String text;

    public TextFeed(String id, String title, String text) {
        super(id, title);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
