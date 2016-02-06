package com.hmm.services;

import android.net.Uri;

import com.hmm.viewmodels.ImagePath;

import java.util.List;

/**
 * Created by arash on 2/2/16.
 */
public interface IImageProviderService {

    List<ImagePath> getAllThumbnails();
    String getOriginalPathForImageId(long id);
    List<ImagePath> getAllImages();

}
