package com.hmm.viewmodels;

/**
 * Created by code1 on 25/01/16.
 */
public class ImageFeed extends Feed {
    private String imageURL;

    public ImageFeed(String id, String title, String imageURL) {
        super(id, title);
        this.imageURL = imageURL;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
