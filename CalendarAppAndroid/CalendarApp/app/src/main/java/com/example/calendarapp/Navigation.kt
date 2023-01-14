package com.example.calendarapp

import android.R
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.content.ContextCompat.startActivity
import com.google.android.material.bottomnavigation.BottomNavigationView


class Navigation {
    //lateinit var bottomNavigationView : BottomNavigationView
    constructor(viewGroup: ViewGroup, appCompatActivity: AppCompatActivity) {
        // Initialize and assign variable
        //bottomNavigationView  = viewGroup.findViewById<BottomNavigationView>(com.example.calendarapp.R.id.navigation)
        val bottomNavigationView: BottomNavigationView by lazy {
            viewGroup.findViewById(com.example.calendarapp.R.id.bottom_navigation)
        }
        // Set Home selected
        when (appCompatActivity::class) {
            MainActivity::class -> {
                bottomNavigationView.selectedItemId = com.example.calendarapp.R.id.toDayButton
            }
            CalendarActivity::class -> {
                bottomNavigationView.selectedItemId = com.example.calendarapp.R.id.toCalendarButton
            }
            TaskActivity::class -> {
                bottomNavigationView.selectedItemId = com.example.calendarapp.R.id.toTaskButton
            }
            SettingsActivity::class -> {
                bottomNavigationView.selectedItemId = com.example.calendarapp.R.id.toSettingsButton
            }
        }

        // Perform item selected listener
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                com.example.calendarapp.R.id.toDayButton -> {
                    if(appCompatActivity != MainActivity::class) {
                        appCompatActivity.startActivity(
                            Intent(
                                appCompatActivity,
                                MainActivity::class.java
                            )
                        )
                    }
                    appCompatActivity.overridePendingTransition(0, 0)
                    return@setOnItemSelectedListener true
                }
                com.example.calendarapp.R.id.toCalendarButton -> {
                    if(appCompatActivity != CalendarActivity::class) {
                        appCompatActivity.startActivity(
                            Intent(
                                appCompatActivity,
                                CalendarActivity::class.java
                            )
                        )
                        appCompatActivity.overridePendingTransition(0, 0)
                        return@setOnItemSelectedListener true
                    }
                }
                com.example.calendarapp.R.id.addEventTask -> return@setOnItemSelectedListener true
                com.example.calendarapp.R.id.toTaskButton -> {
                    if(appCompatActivity != TaskActivity::class) {
                        appCompatActivity.startActivity(
                            Intent(
                                appCompatActivity,
                                TaskActivity::class.java
                            )
                        )
                    }
                    appCompatActivity.overridePendingTransition(0, 0)
                    return@setOnItemSelectedListener true
                }
                com.example.calendarapp.R.id.toSettingsButton-> {
                    if(appCompatActivity != TaskActivity::class) {
                        appCompatActivity.startActivity(
                            Intent(
                                appCompatActivity,
                                SettingsActivity::class.java
                            )
                        )
                    }
                    appCompatActivity.overridePendingTransition(0, 0)
                    return@setOnItemSelectedListener true
                }
            }
            false
        }



    }
}

