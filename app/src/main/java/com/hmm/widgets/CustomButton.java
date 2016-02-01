package com.hmm.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by arash on 2/1/16.
 */
public class CustomButton extends Button implements IWidgetBase {
    public CustomButton(Context context) {
        super(context);
        initView();
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    @Override
    public void initView() {

    }
}
