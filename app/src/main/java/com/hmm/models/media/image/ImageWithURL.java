package com.hmm.models.media.image;

/**
 * Created by code1 on 26/01/16.
 */
public class ImageWithURL extends Image {
    private String url;

    public ImageWithURL(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
