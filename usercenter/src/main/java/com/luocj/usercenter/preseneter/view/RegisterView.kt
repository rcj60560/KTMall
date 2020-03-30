package com.luocj.usercenter.preseneter.view

import com.luocj.baselib.presenter.view.BaseView

interface RegisterView : BaseView {
    fun onRegisterResulter(result: Boolean)
}