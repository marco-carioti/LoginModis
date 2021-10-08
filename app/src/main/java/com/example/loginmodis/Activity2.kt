package com.example.loginmodis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginmodis.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {
    lateinit var binding: Activity2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        var extras = intent.extras
        var username = extras?.getString("username_inserita")
        binding.tuausername.text = "Ciao $username, login effettuato con successo"
    }
}