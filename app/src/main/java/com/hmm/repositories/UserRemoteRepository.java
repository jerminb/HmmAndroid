package com.hmm.repositories;

import com.hmm.models.User;
import com.hmm.models.mission.Mission;
import com.hmm.utils.ICallBack;

/**
 * Created by code1 on 30/01/16.
 */
public class UserRemoteRepository extends RemoteRepository<User> {

    public UserRemoteRepository() {
        super("baseURL");
    }

    public void postMission(Mission mission, ICallBack<Mission> callBack){

    }
}
