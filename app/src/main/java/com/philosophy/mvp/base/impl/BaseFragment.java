package com.philosophy.mvp.base.impl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.philosophy.mvp.base.IBaseError;
import com.philosophy.mvp.base.IBaseModel;
import com.philosophy.mvp.base.IBasePresenter;
import com.philosophy.mvp.base.IBaseView;

public abstract class BaseFragment<View extends IBaseView, Presenter extends IBasePresenter> extends Fragment implements IBaseView {

    protected Presenter presenter;

    public BaseFragment() {

    }

    public abstract Class<Presenter> getPresenterClass();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void setData(IBaseModel data) {

    }

    @Override
    public void showError(IBaseError e) {

    }

}
