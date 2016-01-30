package com.hmm.models.account;

import com.hmm.models.BaseHmmModel;
import com.hmm.models.User;

/**
 * Created by code1 on 26/01/16.
 */
public abstract class Account extends BaseHmmModel {
    protected final InternalAccountType internalAccountType;
    protected final ExternalAccount externalAccount;
    private User owner;

    public Account(InternalAccountType internalAccountType, ExternalAccount externalAccount) {
        this.internalAccountType = internalAccountType;
        this.externalAccount = externalAccount;
    }

    public InternalAccountType getInternalAccountType() {
        return internalAccountType;
    }

    public ExternalAccount getExternalAccount() {
        return externalAccount;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
