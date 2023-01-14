package com.example.calendarapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    private var textView: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val NavBar = Navigation( findViewById<RelativeLayout>(R.id.RLDay),this)

        textView = findViewById<TextView>(R.id.textView)
        textView?.text = "Press the Button"
        val pressMe = findViewById<Button>(R.id.PressMe)

    }

    fun onPressMe(view: View){
        Toast.makeText(applicationContext,"Hello There", Toast.LENGTH_SHORT).show()

        textView?.text = "You Pressed the Button!"
        //finish()
    }

}