package com.transitvancouver.provider

import android.widget.ArrayAdapter
import android.widget.ListAdapter
import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.QuerySnapshot
import com.transitvancouver.repository.FirebaseDBReader

class BusStopsDataProvider {
    fun getAllStops(): Task<QuerySnapshot> {
        return FirebaseDBReader().getAllStops("Routes/3/Route")
    }
}