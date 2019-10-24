package com.transitvancouver.repository

import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.QuerySnapshot
import com.transitvancouver.factories.IConnectionFactory

class FirebaseDBReader : IConnectionFactory {

    fun getAllStops(query : String): Task<QuerySnapshot> {
        var dbInstance = getFirestoreInstance()
        return  dbInstance.collection(query).get()
    }

}