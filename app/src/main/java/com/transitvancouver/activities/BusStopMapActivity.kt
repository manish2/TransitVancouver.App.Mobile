package com.transitvancouver.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import com.transitvancouver.R
import com.transitvancouver.provider.BusStopsDataProvider

class BusStopMapActivity : AppCompatActivity() {
    private lateinit var listView : ListView
    private lateinit var stopFilter : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bus_stop_map)
        var list = ArrayList<String>()
        listView = findViewById(R.id.bus_stop_list)
        stopFilter = findViewById(R.id.stop_filter)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, list)
        BusStopsDataProvider().getAllStops().addOnSuccessListener { doc ->
            for (x in doc.documents) {
                  var shortName = x["RouteShortName"]
                  var longName = x["RouteLongName"]
                  list.add("$shortName -$longName")
            }
            adapter.notifyDataSetChanged()
        }
        listView.adapter = adapter
        stopFilter.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                 //To change body of created functions use File | Settings | File Templates.
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                adapter.filter.filter(s)
                adapter.notifyDataSetChanged()
            }

            override fun afterTextChanged(s: Editable?) {
                //To change body of created functions use File | Settings | File Templates.
            }

        })
    }

}
