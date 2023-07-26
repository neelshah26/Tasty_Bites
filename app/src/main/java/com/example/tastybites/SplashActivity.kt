package com.example.tastybites

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.example.tastybites.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnGetStarted.setOnClickListener {
            val intent = Intent(this@SplashActivity, HomeActivity:: class.java)
            startActivity(intent)
            finish()
        }
    }
}