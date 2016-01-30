package com.hmm.views.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.hmm.viewmodels.Feed;
import com.hmm.views.FeedViewFactory;
import com.hmm.views.IFeedView;

import java.util.ArrayList;

/**
 * Created by code1 on 25/01/16.
 */
public class FeedViewListAdapter extends ArrayAdapter<Feed> {
    public FeedViewListAdapter(Context context, ArrayList<Feed> feeds) {
        super(context, 0, feeds);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Feed feed = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            IFeedView feedView = FeedViewFactory.getInstance().getFeedViewForFeedType(feed, getContext(),parent);
            convertView = feedView.getView();
        }
        // Return the completed view to render on screen
        return convertView;
    }
}
