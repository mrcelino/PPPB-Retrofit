package com.example.retrofitmarcelino

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.retrofitmarcelino.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("userName") ?: "N/A"
        val email = intent.getStringExtra("userEmail") ?: "N/A"
        val avatarUrl = intent.getStringExtra("userAvatar")

        binding.userName.text = name
        binding.userEmail.text = email
        avatarUrl?.let {
            Glide.with(this).load(it).into(binding.userImg)
        }

        binding.home.setOnClickListener {
            finish()
        }
    }
}