package com.akirachix.hello2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.hello2.databinding.ActivityFourthBirdBinding
import com.akirachix.hello2.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class FourthBirdActivity : AppCompatActivity() {

    lateinit var binding: ActivityFourthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityFourthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext4.setOnClickListener {
            val intent = Intent(this, ThirdBirdActivity::class.java)
            startActivity(intent)
        }
        binding.btnPrev4.setOnClickListener{
            val intent= Intent( this,SecondBirdActivity::class.java)
            startActivity(intent)}
        Picasso.get().
        load("https://images.unsplash.com/photo-1560779671-cf681817f968?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8U3BhcnJvd3xlbnwwfHwwfHx8MA%3D%3D")
            .into(binding.Sparrow)
    }
}