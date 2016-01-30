package com.hmm.models.account;

/**
 * Created by code1 on 26/01/16.
 */
public class VirtualAccount extends Account {

    public VirtualAccount() {
        super(InternalAccountType.VirtualAccount, null);
    }
}
