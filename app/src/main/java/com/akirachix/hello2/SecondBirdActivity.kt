package com.akirachix.hello2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.hello2.databinding.ActivityMainBinding
import com.akirachix.hello2.databinding.ActivitySecondBirdBinding
import com.squareup.picasso.Picasso

class SecondBirdActivity : AppCompatActivity() {
        lateinit var binding: ActivitySecondBirdBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding= ActivitySecondBirdBinding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.btnNext2.setOnClickListener {
                val intent = Intent(this, ThirdBirdActivity::class.java)
                startActivity(intent)
            }
                binding.btnPrev2.setOnClickListener{
                    val intent= Intent( this,MainActivity::class.java)
                    startActivity(intent)}
            Picasso.get().
            load("https://plus.unsplash.com/premium_photo-1687191004345-7b515dcb00bb?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8UmFpbmJvd2JpcmR8ZW58MHx8MHx8fDA%3D")
                .into(binding.RainbowBird)
        }
    }

