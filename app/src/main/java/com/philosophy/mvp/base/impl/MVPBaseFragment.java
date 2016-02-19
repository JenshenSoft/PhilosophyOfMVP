package com.philosophy.mvp.base.impl;

import android.support.v4.app.Fragment;

import com.philosophy.mvp.base.IBaseError;
import com.philosophy.mvp.base.IBaseModel;
import com.philosophy.mvp.base.IBasePresenter;
import com.philosophy.mvp.base.IBaseView;

public abstract class MVPBaseFragment<View extends IBaseView, Presenter extends IBasePresenter> extends Fragment implements IBaseView {

    private final Presenter presenter;

    @SuppressWarnings("TryWithIdenticalCatches")
    public MVPBaseFragment() {
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

    protected abstract Class<Presenter> getMVPPresenterClass();

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
