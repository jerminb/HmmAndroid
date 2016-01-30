package com.hmm.models.mission;

import com.hmm.models.BaseHmmModel;
import com.hmm.models.mission.reinforcement.Reinforcement;
import com.hmm.models.service_entities.ServiceEntity;

import java.util.Date;

/**
 * Created by code1 on 27/01/16.
 */
public class Bid extends BaseHmmModel {
    private Date requestDate;
    private Date submissionDate;
    private Reinforcement reinforcement;
    private ServiceEntity placedInBy;

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    public Reinforcement getReinforcement() {
        return reinforcement;
    }

    public void setReinforcement(Reinforcement reinforcement) {
        this.reinforcement = reinforcement;
    }

    public ServiceEntity getPlacedInBy() {
        return placedInBy;
    }

    public void setPlacedInBy(ServiceEntity placedInBy) {
        this.placedInBy = placedInBy;
    }
}
