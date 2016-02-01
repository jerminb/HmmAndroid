package com.hmm.models.mission;

import com.hmm.models.BaseHmmModel;
import com.hmm.models.location.Location;
import com.hmm.models.media.Media;
import com.hmm.models.service_entities.ServiceEntity;
import com.hmm.models.tags.Tag;
import com.hmm.utils.validation.ValidationResult;
import com.hmm.utils.validation.ValidationResultType;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by code1 on 27/01/16.
 */
public abstract class Mission extends BaseHmmModel {
    protected Media media;
    protected String title;
    protected String description;
    protected Location location;
    protected ArrayList<Tag> tags;
    protected Date initiatedAt;
    protected Date estimatedCompletionDate;
    protected Date actualCompletionDate;

    protected ServiceEntity serviceConsumer;
    protected ArrayList<Bid> bids;
    protected ArrayList<Contract> contracts;

    public Mission() {
        this.bids = new ArrayList<Bid>();
        this.contracts = new ArrayList<Contract>();
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    public void setTags(ArrayList<Tag> tags) {
        this.tags = tags;
    }

    public Date getInitiatedAt() {
        return initiatedAt;
    }

    public void setInitiatedAt(Date initiatedAt) {
        this.initiatedAt = initiatedAt;
    }

    public Date getEstimatedCompletionDate() {
        return estimatedCompletionDate;
    }

    public void setEstimatedCompletionDate(Date estimatedCompletionDate) {
        this.estimatedCompletionDate = estimatedCompletionDate;
    }

    public Date getActualCompletionDate() {
        return actualCompletionDate;
    }

    public void setActualCompletionDate(Date actualCompletionDate) {
        this.actualCompletionDate = actualCompletionDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ServiceEntity getServiceConsumer() {
        return serviceConsumer;
    }

    public void setServiceConsumer(ServiceEntity serviceConsumer) {
        this.serviceConsumer = serviceConsumer;
    }

    public ArrayList<Bid> getBids() {
        return bids;
    }

    public ArrayList<Contract> getContracts() {
        return contracts;
    }

    public ValidationResult validate(){
        ValidationResult validationResult = new ValidationResult(ValidationResultType.VALIDATIONSUCCESSFUL);
        /*if(this.getTags() == null || this.getTags().size() == 0){
            validationResult.setType(ValidationResultType.VALIDATIONFAILED);
            validationResult.getValidationErrors().add("Tags are empty");
        }
        else if(this.getTitle() == null || this.getTitle().isEmpty()){
            validationResult.setType(ValidationResultType.VALIDATIONFAILED);
            validationResult.getValidationErrors().add("Title is empty");

        }*/
        return validationResult;
    }
}
