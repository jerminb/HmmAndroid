package com.hmm.models.service_entities;

import com.hmm.models.User;
import com.hmm.models.media.image.Image;
import com.hmm.models.mission.Mission;
import com.hmm.services.UserRemoteService;
import com.hmm.utils.ICallBack;
import com.hmm.utils.Response;

import javax.inject.Inject;

/**
 * Created by code1 on 27/01/16.
 */
public class ServiceUser extends ServiceEntity {
    private User user;

    @Inject
    UserRemoteService userRemoteService;

    public ServiceUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }


    @Override
    public double getRating() {
        return user.getRating();
    }

    @Override
    public double getResponsiveness() {
        return user.getResponsiveness();
    }

    @Override
    public Image getImage() {
        return user.getImage();
    }

    @Override
    public String getDescription() {
        return user.getDescription();
    }

    @Override
    public String getName(){
        return user.getName();
    }

    @Override
    public void postAMission(Mission mission) {
        userRemoteService.postMission(mission, new ICallBack<Mission>() {
            @Override
            public void onFailure(Throwable throwable) {

            }

            @Override
            public void onResponse(Response<Mission> response) {

            }
        });
    }
}
