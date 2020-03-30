package com.luocj.baselib.ui.activity

import androidx.appcompat.app.AppCompatActivity
import com.luocj.baselib.presenter.BasePresenter
import com.luocj.baselib.presenter.view.BaseView

open class BaseMVPActivity<T : BasePresenter<*>> : BaseActivity(),BaseView {
    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun onError() {
    }

    lateinit var mPresenter: T
}