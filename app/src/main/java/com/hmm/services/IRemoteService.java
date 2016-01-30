package com.hmm.services;

import com.hmm.models.BaseHmmModel;
import com.hmm.utils.ICallBack;

import java.util.List;

/**
 * Created by code1 on 28/01/16.
 */
public interface IRemoteService<T extends BaseHmmModel> {
    void insert(T entity, ICallBack<T> callback);
    void update(T entity, ICallBack<T> callback);
    void getById(String id, ICallBack<T> callback);
    void getByCriteria(String criteria, ICallBack<List<T>> callBack);
}
