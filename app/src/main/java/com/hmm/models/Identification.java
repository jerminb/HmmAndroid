package com.hmm.models;

/**
 * Created by code1 on 26/01/16.
 */
public class Identification extends BaseHmmModel {
    private String identificationNumber;
    private IdentificationType identificationType;

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public IdentificationType getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(IdentificationType identificationType) {
        this.identificationType = identificationType;
    }
}
