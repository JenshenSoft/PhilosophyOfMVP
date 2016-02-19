package com.philosophy.mvp.base.impl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.philosophy.mvp.base.IBaseError;
import com.philosophy.mvp.base.IBaseModel;
import com.philosophy.mvp.base.IBasePresenter;
import com.philosophy.mvp.base.IBaseView;

public abstract class MVPBaseFragment<View extends IBaseView, Presenter extends IBasePresenter> extends Fragment implements IBaseView {

    private Presenter presenter;

    protected abstract Class<Presenter> getMVPPresenterClass();

    @SuppressWarnings("TryWithIdenticalCatches")
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            presenter = onCreatePresenter();
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Can't create presenter", e);
        } catch (java.lang.InstantiationException e) {
            throw new RuntimeException("Can't create presenter", e);
        }
        if (presenter == null) {
            throw new RuntimeException("Presenter can't be null");
        }
        presenter.attachView(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    @Override
    public Presenter getPresenter() {
        return presenter;
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


    /* private methods */

    private Presenter onCreatePresenter() throws IllegalAccessException, java.lang.InstantiationException {
        return getMVPPresenterClass().newInstance();
    }
}
