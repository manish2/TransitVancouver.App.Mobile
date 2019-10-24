package com.transitvancouver.handlers.button

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.transitvancouver.activities.BusStopMapActivity


fun handleBusStopClick(context: Context) {
    var intent = Intent(context, BusStopMapActivity::class.java)
    context.startActivity(intent)
}

