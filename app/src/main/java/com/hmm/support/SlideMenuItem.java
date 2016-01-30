package com.hmm.support;

import com.hmm.enums.MenuEnum;

/**
 * Created by arash on 1/30/16.
 */
public class SlideMenuItem implements Resourceble {
    private MenuEnum name;
    private int imageRes;

    public SlideMenuItem(MenuEnum name, int imageRes) {
        this.name = name;
        this.imageRes = imageRes;
    }

    public MenuEnum getName() {
        return name;
    }

    public void setName(MenuEnum name) {
        this.name = name;
    }

    public int getImageRes() {
        return imageRes;
    }
}