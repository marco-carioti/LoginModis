package com.example.loginmodis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.loginmodis.databinding.ActivityMainBinding
import android.R
import android.view.View
import android.widget.Toast


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
                val intent1 = Intent(this,Activity2::class.java).apply {
                    putExtra("username_inserita", binding.username.text.toString())
                }
                var username1 = "Marco"
                var password1 = "123"
                if(username1.equals(binding.username.text.toString())&&(password1.equals(binding.password.text.toString()))) {
                    startActivity(intent1)
                }else(Toast.makeText(this,"Username o Password errati", Toast.LENGTH_LONG).show())
            }

        }
    }
