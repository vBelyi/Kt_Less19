package com.example.kt_less19

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [ToDo::class], version = 1)
abstract class ToDoDatabase: RoomDatabase() {
    abstract fun todoDao():ToDoDAO
}