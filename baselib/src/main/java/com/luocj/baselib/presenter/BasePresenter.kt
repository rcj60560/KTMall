package com.luocj.baselib.presenter

import com.luocj.baselib.presenter.view.BaseView

open class BasePresenter<T : BaseView> {
    lateinit var mView: T
}