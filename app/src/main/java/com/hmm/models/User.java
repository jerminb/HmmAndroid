package com.hmm.models;

import com.hmm.models.account.Account;
import com.hmm.models.media.image.Image;

import java.util.ArrayList;

/**
 * Created by code1 on 26/01/16.
 */
public class User extends BaseHmmModel {
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private TransportationType transportationType;
    private Identification identification;
    private Image image;
    private double rating;
    private double responsiveness;
    private String description;

    private ArrayList<Account> accounts;

    public User() {
        this.accounts = new ArrayList<>(2);
    }

    public User(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public Identification getIdentification() {
        return identification;
    }

    public void setIdentification(Identification identification) {
        this.identification = identification;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TransportationType getTransportationType() {
        return transportationType;
    }

    public void setTransportationType(TransportationType transportationType) {
        this.transportationType = transportationType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getResponsiveness() {
        return responsiveness;
    }

    public void setResponsiveness(double responsiveness) {
        this.responsiveness = responsiveness;
    }

    public String getName(){
        return this.getFirstName() + " " + this.getLastName();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
