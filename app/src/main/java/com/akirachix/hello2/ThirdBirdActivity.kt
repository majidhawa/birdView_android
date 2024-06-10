package com.akirachix.hello2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.hello2.databinding.ActivitySecondBirdBinding
import com.akirachix.hello2.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ThirdBirdActivity : AppCompatActivity() {

        lateinit var binding: ActivityThirdBirdBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding= ActivityThirdBirdBinding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.btnNext3.setOnClickListener {
                val intent = Intent(this, FourthBirdActivity::class.java)
                startActivity(intent)
            }
            binding.btnPrev3.setOnClickListener{
                val intent= Intent( this,SecondBirdActivity::class.java)
                startActivity(intent)}
            Picasso.get().
            load("https://images.unsplash.com/photo-1539418561314-565804e349c0?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8RkxhbWluZ298ZW58MHx8MHx8fDA%3D")
                .into(binding.Flamingo)
        }
    }

