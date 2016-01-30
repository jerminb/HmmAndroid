package com.hmm.models.mission;

import com.hmm.models.mission.Mission;
import com.hmm.models.mission.reinforcement.KnownTypeReinforcement;
import com.hmm.models.mission.reinforcement.MoneyBasedReinforcement;
import com.hmm.models.mission.reinforcement.Reinforcement;
import com.hmm.models.service_entities.ServiceEntity;

import java.util.InvalidPropertiesFormatException;

/**
 * Created by code1 on 28/01/16.
 */
public class CampaignMission extends Mission {
    private MoneyBasedReinforcement initialBidingReinforcement;

    public MoneyBasedReinforcement getInitialBidingReinforcement() {
        return initialBidingReinforcement;
    }

    public void setInitialBidingReinforcement(MoneyBasedReinforcement initialBidingReinforcement) {
        this.initialBidingReinforcement = initialBidingReinforcement;
    }

    protected ContractAward getContractAward() throws InvalidPropertiesFormatException {
        if(this.getContracts() != null && this.getContracts().size() == 1)
        {
            Contract contract = this.getContracts().get(0);
            if(contract.getContractAwards() != null && contract.getContractAwards().size() == 1)
            {
                return contract.getContractAwards().get(0);
            }
        }
        else if(this.getContracts() == null || this.getContracts().size() == 0)
        {
            return null;
        }
        else{
            throw new InvalidPropertiesFormatException("Contract size has to be 1");
        }
        return null;
    }
    public ServiceEntity getAwardedServiceEntity() throws InvalidPropertiesFormatException {
        ContractAward contractAward = this.getContractAward();
        if(contractAward != null)
        {
            return contractAward.getAwardedEntity();
        }
        return null;
    }
    public MoneyBasedReinforcement getAwardedReinforcementAmount() throws InvalidPropertiesFormatException{
        ContractAward contractAward = this.getContractAward();
        if(contractAward != null)
        {
            Reinforcement reinforcement = contractAward.getReinforcementAmount();
            if(reinforcement instanceof MoneyBasedReinforcement)
            {
                return (MoneyBasedReinforcement)reinforcement;
            }
            else
            {
                throw new InvalidPropertiesFormatException("Awarded reinforcement type is invalid");
            }
        }
        return null;

    }
}
