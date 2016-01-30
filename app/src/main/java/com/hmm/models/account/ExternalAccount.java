package com.hmm.models.account;

import com.hmm.models.BaseHmmModel;

/**
 * Created by code1 on 26/01/16.
 */
public abstract class ExternalAccount extends BaseHmmModel {
    protected final ExternalAccountType externalAccountType;

    public ExternalAccount(ExternalAccountType externalAccountType) {
        this.externalAccountType = externalAccountType;
    }

    public ExternalAccountType getExternalAccountType() {
        return externalAccountType;
    }
}
