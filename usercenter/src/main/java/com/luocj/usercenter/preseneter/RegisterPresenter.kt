package com.luocj.usercenter.preseneter

import com.luocj.baselib.presenter.BasePresenter
import com.luocj.usercenter.preseneter.view.RegisterView

class RegisterPresenter : BasePresenter<RegisterView>() {
    fun register(moblie: String, verifyCode: String) {
        mView.onRegisterResulter(false)
    }
}