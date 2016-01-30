package com.hmm.models.tags;

import com.hmm.models.BaseHmmModel;

/**
 * Created by code1 on 27/01/16.
 */
public class Tag extends BaseHmmModel {
    private String name;

    public Tag(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
