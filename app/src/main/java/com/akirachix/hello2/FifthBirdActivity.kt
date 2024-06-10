package com.akirachix.hello2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.hello2.databinding.ActivityFifthBirdBinding
import com.akirachix.hello2.databinding.ActivityFourthBirdBinding
import com.squareup.picasso.Picasso

class FifthBirdActivity : AppCompatActivity() {

    lateinit var binding: ActivityFifthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityFifthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev5.setOnClickListener{
            val intent= Intent( this,SecondBirdActivity::class.java)
            startActivity(intent)}
        Picasso.get().
        load("https://images.unsplash.com/photo-1579296930440-3734ff52712d?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8Zmxvc3N5JTIwYmlyc2R8ZW58MHx8MHx8fDA%3D")
            .into(binding.Flossy)
    }
}