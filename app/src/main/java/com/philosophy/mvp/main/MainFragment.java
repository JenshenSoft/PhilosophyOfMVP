package com.philosophy.mvp.main;

import com.philosophy.mvp.base.MvpBaseFragment;

public class MainFragment extends MvpBaseFragment<IMainView, IMainPresenter> implements IMainView {

    @Override
    public Class<IMainPresenter> getPresenterClass() {
        return IMainPresenter.class;
    }
}
