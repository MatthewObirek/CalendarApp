package com.example.calendarapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.resources.Compatibility.Api21Impl.inflate
import androidx.core.content.ContextCompat.startActivity
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import androidx.core.content.res.ComplexColorCompat.inflate

class Navigation {
    constructor(viewGroup: ViewGroup, appCompatActivity: AppCompatActivity) {

        val inflater = LayoutInflater.from(viewGroup.context);
        val view: View = inflater.inflate(R.layout.navigation, null)

        val addEventTask = view.findViewById<ImageButton>(R.id.addEventTask)

        val toDayButton = view.findViewById<ImageButton>(R.id.toDayButton)
        val toCalendarButton = view.findViewById<ImageButton>(R.id.toCalendarButton)
        val toTaskButton = view.findViewById<ImageButton>(R.id.toTaskButton)
        val toSettingsButton = view.findViewById<ImageButton>(R.id.toSettingsButton)


        addEventTask.setOnClickListener{

        }
        toDayButton.setOnClickListener{
            val intent: Intent = Intent(appCompatActivity, DayActivity::class.java)
            appCompatActivity.startActivity(intent)
            appCompatActivity.finish()
        }
        toCalendarButton.setOnClickListener{
            val intent: Intent = Intent(appCompatActivity, CalendarActivity::class.java)
            appCompatActivity.startActivity(intent)
            appCompatActivity.finish()
        }
        toTaskButton.setOnClickListener{
            val intent: Intent = Intent(appCompatActivity, TaskActivity::class.java)
            appCompatActivity.startActivity(intent)
            appCompatActivity.finish()
        }
        toSettingsButton.setOnClickListener{
            val intent: Intent = Intent(appCompatActivity, SettingsActivity::class.java)
            appCompatActivity.startActivity(intent)
            appCompatActivity.finish()
        }

        viewGroup.addView(view)
    }
}