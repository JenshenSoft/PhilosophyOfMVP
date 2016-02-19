package com.philosophy.mvp.base;

import android.os.Bundle;

public interface IBasePresenter<View extends IBaseView> {

    void onCreate(Bundle arguments, Bundle savedInstanceState);

    void onSaveInstanceState(Bundle bundle);

    void onDestroy();

    boolean isViewAttached();

    View getView();
}
