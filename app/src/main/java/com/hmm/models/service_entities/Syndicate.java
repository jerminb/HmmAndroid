package com.hmm.models.service_entities;

import com.hmm.models.BaseHmmModel;
import com.hmm.models.media.image.Image;
import com.hmm.models.mission.Contract;
import com.hmm.models.mission.ContractAward;
import com.hmm.models.mission.CoopMission;
import com.hmm.models.mission.Mission;
import com.hmm.models.service_entities.ServiceEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.InvalidPropertiesFormatException;
import java.util.Iterator;

/**
 * Created by code1 on 28/01/16.
 */
public class Syndicate extends ServiceEntity {
    private Date formationDate;
    private Date dissolutionDate;
    private String name;
    private Image image;
    private double rating;
    private double responsiveness;
    private String description;

    private CoopMission mission;

    public Date getFormationDate() {
        return formationDate;
    }

    public void setFormationDate(Date formationDate) {
        this.formationDate = formationDate;
    }

    public Date getDissolutionDate() {
        return dissolutionDate;
    }

    public void setDissolutionDate(Date dissolutionDate) {
        this.dissolutionDate = dissolutionDate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void postAMission(Mission mission) {

    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public double getResponsiveness() {
        return responsiveness;
    }

    public void setResponsiveness(double responsiveness) {
        this.responsiveness = responsiveness;
    }

    public CoopMission getMission() {
        return mission;
    }

    public void setMission(CoopMission mission) {
        this.mission = mission;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public ArrayList<ServiceEntity> getMembers() throws InvalidPropertiesFormatException{
        if(mission.getContracts() != null && mission.getContracts().size() > 0)
        {
            ArrayList<ServiceEntity> entities = new ArrayList<ServiceEntity>(mission.getContracts().size());
            for (Iterator ic = mission.getContracts().iterator(); ic.hasNext(); ) {
                Contract contract = (Contract)ic.next();
                if(contract.getContractAwards() != null && contract.getContractAwards().size() > 0)
                {
                    for (Iterator ica = mission.getContracts().iterator(); ica.hasNext(); ) {
                        entities.add(((ContractAward)ica.next()).getAwardedEntity());
                    }
                }
                else{
                    throw new InvalidPropertiesFormatException("Contract Award list is empty");
                }
            }
            return entities;
        }
        else
        {
            throw new InvalidPropertiesFormatException("Contract list is empty");
        }
    }
}
