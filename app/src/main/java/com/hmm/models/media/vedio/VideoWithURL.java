package com.hmm.models.media.vedio;

/**
 * Created by code1 on 27/01/16.
 */
public class VideoWithURL extends Video {
    private String url;

    public VideoWithURL(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
