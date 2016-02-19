package com.philosophy.mvp.base.impl;

import android.os.Bundle;

import com.philosophy.mvp.base.IBasePresenter;
import com.philosophy.mvp.base.IBaseView;

public abstract class BasePresenter<View extends IBaseView> implements IBasePresenter<View> {

    private final View view;

    public BasePresenter(View view) {
        this.view = view;
    }

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
    public boolean isViewAttached() {
        return view != null;
    }

    @Override
    public View getView() {
        return view;
    }
}
