package com.enigma.simple_android_submission.ui.about

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enigma.simple_android_submission.R

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = "About"
        }

    }
}