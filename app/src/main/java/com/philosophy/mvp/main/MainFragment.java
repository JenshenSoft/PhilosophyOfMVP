package com.philosophy.mvp.main;

import com.philosophy.mvp.base.impl.BaseFragment;
import com.philosophy.mvp.main.mvp.IMainView;
import com.philosophy.mvp.main.mvp.MainPresenter;

public class MainFragment extends BaseFragment<IMainView, MainPresenter> {


    @Override
    public Class<MainPresenter> getPresenterClass() {
        return MainPresenter.class;
    }
}
