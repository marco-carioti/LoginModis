package com.example.loginmodis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginmodis.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onButtonClick()
        }
        fun onButtonClick(){
            binding.button.setOnClickListener{
                val intent1 = Intent(this,Activity2::class.java)
                var username1 = "Marco"
                var password1 = "123"
                if(username1.equals(R.id.username)&&(password1.equals(R.id.password)))
                    startActivity(intent1)
            }

        }
    }
