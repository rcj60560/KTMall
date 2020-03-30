package com.luocj.usercenter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.anko.toast

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        val intExtra = intent.getIntExtra("id", -1)
        toast("${intExtra}")
    }
}