package com.example.labor3

import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        // Wait 5 seconds, then start MainActivity
        android.os.Handler().postDelayed({
            startActivity(android.content.Intent(this, MainActivity::class.java))
            finish()
        }, 3000)
    }

    override fun onStart() {
        super.onStart()
        val splashImage = findViewById<ImageView>(R.id.splashImage)
        splashImage.animate().alpha(1f).setDuration(1200).start()
    }
}