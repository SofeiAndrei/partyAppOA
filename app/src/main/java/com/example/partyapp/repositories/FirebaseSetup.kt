package com.example.partyapp.repositories

import com.google.firebase.database.FirebaseDatabase

open class FirebaseSetup(
    val database: FirebaseDatabase = FirebaseDatabase.getInstance("https://partyappoa-default-rtdb.europe-west1.firebasedatabase.app/")
)