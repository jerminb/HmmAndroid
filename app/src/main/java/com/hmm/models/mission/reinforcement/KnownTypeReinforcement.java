package com.hmm.models.mission.reinforcement;

/**
 * Created by code1 on 27/01/16.
 */
public abstract class KnownTypeReinforcement extends Reinforcement {

    protected double amount;

    public KnownTypeReinforcement(ReinforcementType reinforcementType, double amount) {
        super(reinforcementType);
        this.amount = amount;
    }

    @Override
    public String  getAmount() {
        return String.valueOf(amount);
    }
}
