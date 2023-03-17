package com.prachi.sample.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.prachi.sample.myapplication.text.NormalTextActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startNormalTextExample(view: View) {
        startActivity(Intent(this, NormalTextActivity::class.java))
    }
}