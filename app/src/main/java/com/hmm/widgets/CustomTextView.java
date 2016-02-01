package com.hmm.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by arash on 2/1/16.
 */
public class CustomTextView extends TextView implements IWidgetBase {
    public CustomTextView(Context context) {
        super(context);
        initView();
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }


    @Override
    public void initView() {

    }
}
