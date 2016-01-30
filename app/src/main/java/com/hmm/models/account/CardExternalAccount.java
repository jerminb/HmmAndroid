package com.hmm.models.account;

/**
 * Created by code1 on 26/01/16.
 */
public abstract class CardExternalAccount extends ExternalAccount {
    private String cardNumber;
    private String cardHolder;
    private int expireyMonth;
    private int expireyYear;
    private String issuingCountry;
    private String issuingBank;

    public CardExternalAccount(ExternalAccountType externalAccountType) {
        super(externalAccountType);
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public int getExpireyMonth() {
        return expireyMonth;
    }

    public void setExpireyMonth(int expireyMonth) {
        this.expireyMonth = expireyMonth;
    }

    public int getExpireyYear() {
        return expireyYear;
    }

    public void setExpireyYear(int expireyYear) {
        this.expireyYear = expireyYear;
    }

    public String getIssuingCountry() {
        return issuingCountry;
    }

    public void setIssuingCountry(String issuingCountry) {
        this.issuingCountry = issuingCountry;
    }

    public String getIssuingBank() {
        return issuingBank;
    }

    public void setIssuingBank(String issuingBank) {
        this.issuingBank = issuingBank;
    }

    public String getExpireyDate(){
        return String.format("%02d", expireyMonth) + "/" + String.format("%02d", expireyYear);
    }
}
