package com.example.kt_less19

import android.app.Application
import androidx.room.Room

class MyApplication: Application() {
    lateinit var repo: ToDoRepository

    override fun onCreate() {
        super.onCreate()
        instance = this
        val db = Room.databaseBuilder(context = this, klass = ToDoDatabase::class.java, name = "to_do_database").build()
        repo = ToDoRepository(db)
    }

    companion object {
        private lateinit var instance: MyApplication
        fun getApp() = instance
    }

}