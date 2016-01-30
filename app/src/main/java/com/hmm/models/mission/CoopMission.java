package com.hmm.models.mission;

import com.hmm.models.mission.reinforcement.UnknownTypeReinforcement;

/**
 * Created by code1 on 28/01/16.
 */
public class CoopMission extends Mission {
    private UnknownTypeReinforcement initialReinforcement;

    public UnknownTypeReinforcement getInitialReinforcement() {
        return initialReinforcement;
    }

    public void setInitialReinforcement(UnknownTypeReinforcement initialReinforcement) {
        this.initialReinforcement = initialReinforcement;
    }
}
