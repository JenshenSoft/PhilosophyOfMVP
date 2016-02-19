package com.philosophy.mvp.base;

public interface IBaseView<Model extends IBaseModel, Error extends IBaseError> {
    void setData(Model model);
}
