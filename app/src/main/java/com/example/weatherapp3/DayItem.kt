package com.example.weatherapp3

import android.media.Image
import android.service.notification.Condition

data class DayItem(
    val city: String,
    val time: String,
    val condition: String,
    val image: String,
    val currentTemp: String,
    val maxTemp: String,
    val minTemp: String,
    val hours: String

    )
