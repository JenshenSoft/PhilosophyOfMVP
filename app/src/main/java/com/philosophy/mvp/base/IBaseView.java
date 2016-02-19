package com.philosophy.mvp.base;

public interface IBaseView<M extends IBaseModel, P> {

    void setData(M model);

}
