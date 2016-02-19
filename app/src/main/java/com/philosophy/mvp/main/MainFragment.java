package com.philosophy.mvp.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.philosophy.mvp.R;
import com.philosophy.mvp.base.impl.MVPBaseFragment;
import com.philosophy.mvp.main.mvp.IMainView;
import com.philosophy.mvp.main.mvp.MainPresenter;

public class MainFragment extends MVPBaseFragment<IMainView, MainPresenter> implements IMainView {

    @Override
    public Class<MainPresenter> getMVPPresenterClass() {
        return MainPresenter.class;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.content_main, container, false);
    }
}
