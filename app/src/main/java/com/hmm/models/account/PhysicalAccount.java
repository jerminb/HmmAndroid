package com.hmm.models.account;

/**
 * Created by code1 on 26/01/16.
 */
public class PhysicalAccount extends Account {

    private boolean isActive;

    public PhysicalAccount(ExternalAccount externalAccount) {
        super(InternalAccountType.PhysicalAccountType, externalAccount);

        isActive = false;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
}
