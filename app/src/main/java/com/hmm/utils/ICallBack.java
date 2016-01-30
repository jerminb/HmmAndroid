package com.hmm.utils;

/**
 * Created by code1 on 30/01/16.
 */
public interface ICallBack<T> {
    void onFailure(Throwable throwable);
    void onResponse(Response<T> response);
}
