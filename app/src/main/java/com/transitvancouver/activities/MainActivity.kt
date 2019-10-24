package com.transitvancouver.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.transitvancouver.R
import com.transitvancouver.handlers.button.handleBusStopClick
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mapClickListenersToHandlers()
    }

    private fun mapClickListenersToHandlers() {
        //btn_mapview.setOnClickListener(handleMapViewClick)
        btn_bus_stop.setOnClickListener { handleBusStopClick(context = this) }

    }

}
