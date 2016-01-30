package com.hmm.views;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hmm.R;
import com.hmm.viewmodels.TextFeed;

/**
 * Created by code1 on 25/01/16.
 */
public class TextFeedView extends FeedView<TextFeed> {
    public TextFeedView(TextFeed feed, Context context, ViewGroup viewGroupRoot) {
        super(feed, context, viewGroupRoot);
    }

    @Override
    protected void customizeViewWithFeed(View view) {
        TextView txtfvTitle = (TextView) view.findViewById(R.id.txtfv_title);
        TextView txtfvContent = (TextView) view.findViewById(R.id.txtfv_content);

        txtfvTitle.setText(((TextFeed)feed).getTitle());
        txtfvContent.setText(((TextFeed)feed).getText());
    }

    @Override
    protected int getLayoutId() {
        return R.layout.layout_text_feed;
    }
}
