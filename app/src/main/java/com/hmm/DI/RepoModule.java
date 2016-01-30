package com.hmm.DI;

import com.hmm.repositories.UserRemoteRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by code1 on 30/01/16.
 */
@Module
public class RepoModule {

    @Provides
    @Singleton
    UserRemoteRepository provideUserRemoteRepository () {
        UserRemoteRepository userRemoteRepository = new UserRemoteRepository();
        return userRemoteRepository;
    }
}
