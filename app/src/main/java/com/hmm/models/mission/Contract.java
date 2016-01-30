package com.hmm.models.mission;

import com.hmm.models.BaseHmmModel;
import com.hmm.models.service_entities.ServiceEntity;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by code1 on 27/01/16.
 */
public class Contract extends BaseHmmModel {
    private Date startDate;
    private Date endDate;
    private String obligatoryBody;
    private ArrayList<ServiceEntity> initiatingEntities;
    private ArrayList<ContractAward> contractAwards;

    public Contract() {
        this.initiatingEntities = new ArrayList<ServiceEntity>();
        this.contractAwards = new ArrayList<ContractAward>();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getObligatoryBody() {
        return obligatoryBody;
    }

    public void setObligatoryBody(String obligatoryBody) {
        this.obligatoryBody = obligatoryBody;
    }

    public ArrayList<ServiceEntity> getInitiatingEntities() {
        return initiatingEntities;
    }

    public ArrayList<ContractAward> getContractAwards() {
        return contractAwards;
    }
}
