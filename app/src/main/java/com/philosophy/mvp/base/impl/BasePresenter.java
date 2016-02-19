package com.philosophy.mvp.base.impl;

import android.os.Bundle;

import com.philosophy.mvp.base.IBasePresenter;
import com.philosophy.mvp.base.IBaseView;

public abstract class BasePresenter<View extends IBaseView> implements IBasePresenter<View> {

    private View mView;

    @Override
    public void onCreate(Bundle arguments, Bundle savedInstanceState) {

    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void attachView(View view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }

    @Override
    public boolean isViewAttached() {
        return mView != null;
    }

    @Override
    public View getView() {
        return mView;
    }
}
