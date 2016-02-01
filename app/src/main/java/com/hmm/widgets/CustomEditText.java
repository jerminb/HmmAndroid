package com.hmm.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by arash on 2/1/16.
 */
public class CustomEditText extends EditText implements IWidgetBase {
    public CustomEditText(Context context) {
        super(context);
        initView();
    }

    public CustomEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public CustomEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    @Override
    public void initView() {

    }
}
