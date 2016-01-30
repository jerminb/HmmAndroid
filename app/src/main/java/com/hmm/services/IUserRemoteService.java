package com.hmm.services;

import com.hmm.models.User;
import com.hmm.models.mission.Mission;
import com.hmm.repositories.IRemoteRepository;
import com.hmm.utils.ICallBack;

/**
 * Created by code1 on 30/01/16.
 */
public interface IUserRemoteService extends IRemoteRepository<User> {
    void postMission(Mission mission, ICallBack<Mission> callBack);
}
