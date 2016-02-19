package com.philosophy.mvp.main.mvp;

import com.philosophy.mvp.base.impl.BasePresenter;

public class MainPresenter extends BasePresenter<IMainView> {

    private final IMainView mainView;

    public MainPresenter(IMainView mainView) {
        this.mainView = mainView;
    }
}
