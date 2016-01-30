package com.hmm.models.service_entities;

import com.hmm.models.BaseHmmModel;
import com.hmm.models.media.image.Image;
import com.hmm.models.mission.Mission;

/**
 * Created by code1 on 27/01/16.
 */
public abstract class ServiceEntity extends BaseHmmModel {
    public abstract double getRating();
    public abstract double getResponsiveness();
    public abstract Image getImage();
    public abstract String getDescription();
    public abstract String getName();

    public abstract void postAMission(Mission mission);
}
