package com.hmm.DI;

import com.hmm.models.User;
import com.hmm.models.service_entities.ServiceUser;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by code1 on 30/01/16.
 */

@Singleton
@Component(modules = ServiceModule.class)
public interface ServiceComponent {
    void inject(ServiceUser serviceUser);
}
