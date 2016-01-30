package com.hmm.repositories;

import com.hmm.models.BaseHmmModel;
import com.hmm.utils.ICallBack;

import java.util.List;

import retrofit.Retrofit;

/**
 * Created by code1 on 30/01/16.
 */
public class RemoteRepository<T extends BaseHmmModel> implements IRemoteRepository<T> {

    protected String baseURL;
    protected Retrofit retrofit;

    public RemoteRepository(String baseURL) {
        this.baseURL = baseURL;
        /*this.retrofit = new Retrofit.Builder()
                .baseUrl(baseURL)
                .build();*/
    }

    @Override
    public void insert(T entity, ICallBack<T> callback){

    }

    @Override
    public void update(T entity, ICallBack<T> callback) {

    }

    @Override
    public void getById(String id, ICallBack<T> callback) {

    }

    @Override
    public void getByCriteria(String criteria, ICallBack<List<T>> callBack) {

    }
}
