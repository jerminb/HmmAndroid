package com.hmm.main.gallery_fragments;

import com.hmm.viewmodels.ImagePath;

import java.util.List;

/**
 * Created by arash on 2/6/16.
 */
public interface IGalleryFragmentHandler {
    void imageSelectionFinished(List<ImagePath> selectedImages);
}
