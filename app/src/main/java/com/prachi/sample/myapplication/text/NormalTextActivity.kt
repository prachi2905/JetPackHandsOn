package com.prachi.sample.myapplication.text

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.prachi.sample.myapplication.R

class NormalTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally,
                content = {
                    NormalText(getString(R.string.display_normal_text))
                }
            )
        }
    }

    @Composable
    fun NormalText(displaytext: String) {
        Text(text = displaytext)
    }

    @Preview
    @Composable
    fun NormalTextPreciew() {
        NormalText(getString(R.string.display_normal_text))
    }
}
