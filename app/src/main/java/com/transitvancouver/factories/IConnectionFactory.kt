package com.transitvancouver.factories

import com.google.firebase.firestore.FirebaseFirestore

interface IConnectionFactory {
    fun getFirestoreInstance() : FirebaseFirestore {
        return FirebaseFirestore.getInstance()
    }
}