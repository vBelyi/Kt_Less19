package com.example.kt_less19

import java.util.concurrent.Executors

class ToDoRepository(private val database: ToDoDatabase ) {
    private val executor = Executors.newSingleThreadExecutor()

    fun getAll() = database.todoDao().getAll()

    fun add(toDo: ToDo){
        executor.execute { database.todoDao().add(toDo) }
    }

    fun remove(toDo: ToDo) {
        executor.execute { database.todoDao().delete(toDo) }
    }
}