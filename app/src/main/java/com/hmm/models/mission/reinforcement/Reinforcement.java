package com.hmm.models.mission.reinforcement;

import com.hmm.models.BaseHmmModel;

/**
 * Created by code1 on 27/01/16.
 */
public abstract class Reinforcement extends BaseHmmModel {
    private ReinforcementType reinforcementType;
    //For multiway deals the initial amount could just be simple text like: split even

    public Reinforcement(ReinforcementType reinforcementType) {
        this.reinforcementType = reinforcementType;
    }

    public ReinforcementType getReinforcementType() {
        return reinforcementType;
    }

    public void setReinforcementType(ReinforcementType reinforcementType) {
        this.reinforcementType = reinforcementType;
    }
    //For multiway deals the initial amount could just be simple text like: split even
    public abstract String getAmount();
}
