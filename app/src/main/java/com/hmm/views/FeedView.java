package com.hmm.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hmm.R;
import com.hmm.viewmodels.Feed;

import java.util.Vector;

/**
 * Created by code1 on 25/01/16.
 */
public abstract class FeedView<T extends Feed> implements IFeedView {
    T feed;
    Context context;
    int layout;
    ViewGroup viewGroupRoot;

    public FeedView(T feed, Context context, ViewGroup viewGroupRoot) {
        this.feed = feed;
        this.context = context;
        this.layout = getLayoutId();
        this.viewGroupRoot = viewGroupRoot;
    }

    public T getFeed() {
        return feed;
    }

    public void setFeed(T feed) {
        this.feed = feed;
    }

    @Override
    public View getView(){
        View v = LayoutInflater.from(context).inflate(layout, this.viewGroupRoot, false);
        customizeViewWithFeed(v);
        return v;
    }

    protected abstract void customizeViewWithFeed(View view);
    protected abstract int getLayoutId();
}
