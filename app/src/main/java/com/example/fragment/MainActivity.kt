package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcomeFg = WelcomeFragment() //welcomeFg = new WelcomeFragment(); (JAVA)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.myFrame, welcomeFg)
            commit()
        }

    }
}