package com.hmm.models.mission.reinforcement;

/**
 * Created by code1 on 27/01/16.
 */
public class UnknownTypeReinforcement extends Reinforcement {
    private String amount;

    public UnknownTypeReinforcement(String amount) {
        super(ReinforcementType.UNKNOWN);
        this.amount = amount;
    }

    @Override
    public String getAmount() {
        return amount;
    }
}
