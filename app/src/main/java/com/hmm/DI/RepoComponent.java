package com.hmm.DI;

import com.hmm.repositories.UserRemoteRepository;
import com.hmm.services.UserRemoteService;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by code1 on 30/01/16.
 */
@Singleton
@Component(modules = RepoModule.class)
public interface RepoComponent
{
    void inject(UserRemoteService userRemoteService);
}
