package com.lianxi.zy.myrookie.model;

import com.lianxi.zy.myrookie.retrofit.RetrofitUtils;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by ${zy} on 2017/12/20.
 */

public class FragThreeModel implements  IFragThreeModel{

    @Override
    public void getData(Observer observer) {
        RetrofitUtils.getApiService().getFenleiData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

}
