package com.hmm.services;

import com.hmm.models.BaseHmmModel;
import com.hmm.utils.ICallBack;

import java.util.List;

/**
 * Created by code1 on 30/01/16.
 */
public abstract class RemoteService<T extends BaseHmmModel> implements IRemoteService<T> {
    @Override
    public void insert(T entity, ICallBack<T> callback) {

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
