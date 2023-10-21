package com.example.kt_less19

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query


@Dao
interface ToDoDAO {

    @Insert
    fun add(toDo: ToDo)

    @Delete
    fun delete(toDo: ToDo)

    @Query("SELECT * FROM todo")
    fun getAll():LiveData<List<ToDo>>
}