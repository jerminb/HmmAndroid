package com.hmm.application;

import android.app.Application;

import com.hmm.DI.DaggerRepoComponent;
import com.hmm.DI.DaggerServiceComponent;
import com.hmm.DI.RepoComponent;
import com.hmm.DI.RepoModule;
import com.hmm.DI.ServiceComponent;
import com.hmm.DI.ServiceModule;

/**
 * Created by code1 on 30/01/16.
 */
public class HmmApp extends Application implements IDaggerComponentProvider {
    private RepoComponent repoComponent;
    private ServiceComponent serviceComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        repoComponent = DaggerRepoComponent.builder().repoModule(new RepoModule()).build();
        serviceComponent = DaggerServiceComponent.builder().serviceModule(new ServiceModule(this)).build();
    }

    public RepoComponent getRepoComponent() {
        return repoComponent;
    }

    public ServiceComponent getServiceComponent() {
        return serviceComponent;
    }
}
