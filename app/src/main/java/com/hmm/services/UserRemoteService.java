package com.hmm.services;

import com.hmm.models.User;
import com.hmm.models.mission.Mission;
import com.hmm.repositories.UserRemoteRepository;
import com.hmm.utils.ICallBack;

import javax.inject.Inject;

/**
 * Created by code1 on 30/01/16.
 */
public class UserRemoteService extends RemoteService<User> implements IUserRemoteService {
    @Inject
    UserRemoteRepository userRemoteRepository;

    @Override
    public void postMission(Mission mission, ICallBack<Mission> callBack) {
        userRemoteRepository.postMission(mission, callBack);
    }
}
