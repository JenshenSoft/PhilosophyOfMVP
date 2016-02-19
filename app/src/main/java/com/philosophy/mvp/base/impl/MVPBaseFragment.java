package com.philosophy.mvp.base.impl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.philosophy.mvp.base.IBaseError;
import com.philosophy.mvp.base.IBaseModel;
import com.philosophy.mvp.base.IBasePresenter;
import com.philosophy.mvp.base.IBaseView;

import java.lang.reflect.InvocationTargetException;

public abstract class MVPBaseFragment<View extends IBaseView, Presenter extends IBasePresenter> extends Fragment implements IBaseView {

    protected Presenter presenter;

    protected abstract Class<Presenter> getMVPPresenterClass();

    protected abstract View getMVPView();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            presenter = onCreatePresenter();
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Can't create presenter", e);
        } catch (java.lang.InstantiationException e) {
            throw new RuntimeException("Can't create presenter", e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Can't create presenter", e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException("Can't create presenter", e);
        }
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

    private Presenter onCreatePresenter() throws IllegalAccessException, java.lang.InstantiationException, NoSuchMethodException, InvocationTargetException {
        final View mvpView = getMVPView();
        if (mvpView == null) {
            throw new NullPointerException("mvpView cannot to be null");
        }
        return getMVPPresenterClass().getConstructor(mvpView.getClass()).newInstance(mvpView);
    }
}
