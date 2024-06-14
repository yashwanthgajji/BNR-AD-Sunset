package com.yash.android.bnr.sunset

import android.animation.ObjectAnimator
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.yash.android.bnr.sunset.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.scene.setOnClickListener {
            startAnimation()
        }
    }
    private fun startAnimation() {
        val sunYStart = binding.sun.top.toFloat()
        val sunYEnd = binding.sky.height.toFloat()
        val heightAnimator = ObjectAnimator
            .ofFloat(binding.sun, "y", sunYStart, sunYEnd)
            .setDuration(3000)
        heightAnimator.start()
    }
}