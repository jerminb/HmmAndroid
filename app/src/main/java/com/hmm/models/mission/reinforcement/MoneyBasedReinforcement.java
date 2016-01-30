package com.hmm.models.mission.reinforcement;

/**
 * Created by code1 on 27/01/16.
 */
public class MoneyBasedReinforcement extends KnownTypeReinforcement {
    public MoneyBasedReinforcement(double amount) {
        super(ReinforcementType.ACTUAL, amount);
        this.amount = amount;
    }
}
