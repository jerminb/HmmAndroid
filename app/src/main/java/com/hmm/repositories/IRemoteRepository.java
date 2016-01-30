package com.hmm.repositories;

import com.hmm.models.BaseHmmModel;
import com.hmm.utils.ICallBack;

import java.util.List;

/**
 * Created by code1 on 30/01/16.
 */
public interface IRemoteRepository<T extends BaseHmmModel> {
    void insert(T entity, ICallBack<T> callback);
    void update(T entity, ICallBack<T> callback);
    void getById(String id, ICallBack<T> callback);
    void getByCriteria(String criteria, ICallBack<List<T>> callBack);
}
