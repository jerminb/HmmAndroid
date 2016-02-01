package com.hmm.models.service_entities;

import com.hmm.models.BaseHmmModel;
import com.hmm.models.media.image.Image;
import com.hmm.models.mission.Mission;
import com.hmm.utils.validation.ValidationResult;
import com.hmm.utils.validation.ValidationResultType;

import java.security.InvalidParameterException;

/**
 * Created by code1 on 27/01/16.
 */
public abstract class ServiceEntity extends BaseHmmModel {
    public abstract double getRating();
    public abstract double getResponsiveness();
    public abstract Image getImage();
    public abstract String getDescription();
    public abstract String getName();

    public void postAMission(Mission mission){
        if(mission.validate().getType() == ValidationResultType.VALIDATIONSUCCESSFUL)
        {
            this._post(mission);
        }
        else
        {
            throw new InvalidParameterException("Mission validation failed");
        }
    }

    protected abstract void _post(Mission mission);
}
