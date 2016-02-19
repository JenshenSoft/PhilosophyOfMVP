package com.philosophy.mvp.base;

public interface IBaseView<Model extends IBaseModel, Error extends IBaseError> {
    void showLoading();

    void hideLoading();

    void setData(Model data);

    void showError(Error e);
}
