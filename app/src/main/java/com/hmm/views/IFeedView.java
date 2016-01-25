package com.hmm.views;

import android.view.View;

import com.hmm.viewmodels.Feed;

/**
 * Created by code1 on 25/01/16.
 */
public interface IFeedView {

    void initializeWithFeed(Feed feed);
    View getView();
}
