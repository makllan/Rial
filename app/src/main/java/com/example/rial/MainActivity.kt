package com.example.rial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val lottieAnimationView = findViewById<LottieAnimationView>(R.id.lottieAnimationView2)
        lottieAnimationView.setAnimation(R.raw.guru)
        lottieAnimationView.repeatMode
        val loginActivity = Intent(this, Login::class.java)
        val registerSplash = Intent(this, Register_splash::class.java)

        val btnRegister= findViewById<Button>(R.id.register)

        btnRegister.setOnClickListener {
            startActivity(registerSplash)
        }

        val btn = findViewById<Button>(R.id.login)
        btn.setOnClickListener {
            startActivity(loginActivity)
        }
    }
}