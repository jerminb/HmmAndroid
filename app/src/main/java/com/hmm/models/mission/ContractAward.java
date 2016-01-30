package com.hmm.models.mission;

import com.hmm.models.BaseHmmModel;
import com.hmm.models.mission.reinforcement.KnownTypeReinforcement;
import com.hmm.models.mission.reinforcement.Reinforcement;
import com.hmm.models.service_entities.ServiceEntity;

import java.util.Date;

/**
 * Created by code1 on 27/01/16.
 */
public class ContractAward extends BaseHmmModel {
    private Bid bid;
    private KnownTypeReinforcement reinforcementAmount;
    private Date awardDate;

    public Bid getBid() {
        return bid;
    }

    public void setBid(Bid bid) {
        this.bid = bid;
    }

    public KnownTypeReinforcement getReinforcementAmount() {
        return reinforcementAmount;
    }

    public void setReinforcementAmount(KnownTypeReinforcement reinforcementAmount) {
        this.reinforcementAmount = reinforcementAmount;
    }

    public Date getAwardDate() {
        return awardDate;
    }

    public void setAwardDate(Date awardDate) {
        this.awardDate = awardDate;
    }

    public ServiceEntity getAwardedEntity(){
        return bid.getPlacedInBy();
    }
}
