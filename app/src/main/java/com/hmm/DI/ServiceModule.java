package com.hmm.DI;

import com.hmm.application.IDaggerComponentProvider;
import com.hmm.services.UserRemoteService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by code1 on 30/01/16.
 */

@Module
public class ServiceModule {

    private IDaggerComponentProvider daggerComponentProvider;

    public ServiceModule(IDaggerComponentProvider daggerComponentProvider) {
        this.daggerComponentProvider = daggerComponentProvider;
    }

    @Provides
    @Singleton
    UserRemoteService provideUserRemoteService(){
        UserRemoteService userRemoteService = new UserRemoteService();
        daggerComponentProvider.getRepoComponent().inject(userRemoteService);

        return userRemoteService;
    }
}
