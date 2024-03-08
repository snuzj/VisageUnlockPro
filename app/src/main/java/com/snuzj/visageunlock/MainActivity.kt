package com.snuzj.visageunlock

import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.snuzj.visageunlock.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var isLeftImage = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.infoBtn.setOnClickListener{
            startActivity(Intent(this, AboutAppActivity::class.java))
        }


        binding.sideBtn.setOnClickListener {
            if (isLeftImage) {
                binding.sideBtn.setImageResource(R.drawable.double_arrow_left)
            } else {
                binding.sideBtn.setImageResource(R.drawable.double_arrow_right)
            }
            isLeftImage = !isLeftImage
        }

    }
}