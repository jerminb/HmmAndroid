package com.hmm.models.mission.reinforcement;

/**
 * Created by code1 on 27/01/16.
 */
public class ProfitSharingReinforcement extends KnownTypeReinforcement {

    public ProfitSharingReinforcement(Double amount) {
        super(ReinforcementType.PERCENTAGE, amount);
    }
}
