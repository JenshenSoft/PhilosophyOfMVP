package com.philosophy.mvp.base;

import android.support.v4.app.Fragment;

import com.philosophy.mvp.main.IMainPresenter;

public abstract class MvpBaseFragment<View extends IBaseView, Presenter extends IBasePresenter> extends Fragment {

    public abstract Class<Presenter> getPresenterClass();

}
