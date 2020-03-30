package com.luocj.usercenter

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.luocj.baselib.ui.activity.BaseMVPActivity
import com.luocj.usercenter.preseneter.RegisterPresenter
import com.luocj.usercenter.preseneter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.toast

class RegisterActivity : BaseMVPActivity<RegisterPresenter>(), RegisterView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        mPresenter = RegisterPresenter()
        mPresenter.mView = this;
        btnResgiter.setOnClickListener {
//            Toast.makeText(this, "haha", Toast.LENGTH_SHORT).show()
//            toast("sfdf");
            mPresenter.register("", "");
        }
    }

    override fun onRegisterResulter(result: Boolean) {
        toast("${result}")
    }
}