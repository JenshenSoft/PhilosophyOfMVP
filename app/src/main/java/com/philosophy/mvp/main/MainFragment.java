package com.philosophy.mvp.main;

import com.philosophy.mvp.base.impl.MVPBaseFragment;
import com.philosophy.mvp.main.mvp.IMainView;
import com.philosophy.mvp.main.mvp.MainPresenter;

public class MainFragment extends MVPBaseFragment<IMainView, MainPresenter> implements IMainView {

    @Override
    public Class<MainPresenter> getMVPPresenterClass() {
        return MainPresenter.class;
    }

    @Override
    public IMainView getMVPView() {
        return this;
    }
}
