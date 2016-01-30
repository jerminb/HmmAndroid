package com.hmm.views;

import android.content.Context;
import android.view.ViewGroup;

import com.hmm.viewmodels.Feed;
import com.hmm.viewmodels.TextFeed;

import org.w3c.dom.Text;

import java.lang.reflect.Type;

/**
 * Created by code1 on 25/01/16.
 */
public class FeedViewFactory {
    private static FeedViewFactory instance = null;
    protected FeedViewFactory() {
        // Exists only to defeat instantiation.
    }
    public static FeedViewFactory getInstance() {
        if(instance == null) {
            instance = new FeedViewFactory();
        }
        return instance;
    }
    public IFeedView getFeedViewForFeedType(Feed feed, Context context, ViewGroup viewGroupRoot){
        if(feed instanceof TextFeed){
            return  new TextFeedView((TextFeed)feed, context, viewGroupRoot);
        }
        return  null;
    }
}
