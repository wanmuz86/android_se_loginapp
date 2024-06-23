package com.muzaffar.loginapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.muzaffar.loginapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val bundle = intent.extras!!
        val result1 = bundle.getString("username")
        val result2 = bundle.getString("password")
        binding.userNameTextView.text = result1
        binding.passwordTextView.text = result2

    }
}