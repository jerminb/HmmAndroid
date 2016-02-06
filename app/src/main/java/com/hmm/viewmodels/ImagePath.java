package com.hmm.viewmodels;

/**
 * Created by arash on 2/4/16.
 */
public class ImagePath {

    private String mThumbnailPath;
    private long mOriginalId;
    private boolean isSelected;

    public ImagePath(String thumbnail, long originalId) {
        mThumbnailPath = thumbnail;
        mOriginalId = originalId;
        isSelected = false;
    }

    public String getmThumbnailPath() {
        return mThumbnailPath;
    }

    public long getmOriginalId() {
        return mOriginalId;
    }

    public void setmThumbnailPath(String mThumbnailPath) {
        this.mThumbnailPath = mThumbnailPath;
    }

    public void setmOriginalId(long mOriginalId) {
        this.mOriginalId = mOriginalId;
    }

    public void setIsSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

    public boolean isSelected() {
        return isSelected;
    }
}
