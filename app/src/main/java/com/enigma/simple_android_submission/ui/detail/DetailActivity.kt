package com.enigma.simple_android_submission.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.enigma.simple_android_submission.MainActivity
import com.enigma.simple_android_submission.data.models.Menu
import com.enigma.simple_android_submission.databinding.ActivityDetailBinding
import com.enigma.simple_android_submission.util.Converter

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val menu = intent.getSerializableExtra(MainActivity.MENU) as Menu

        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = menu.name
        }

        binding.apply {
            Glide.with(this@DetailActivity)
                .load(menu.image)
                .into(ivMenusDetail)
            tvTitleDetail.text = menu.name
            tvPriceDetail.text = Converter.rupiah(menu.price.toDouble())
            tvDescriptionDetail.text = menu.description
        }
    }
}