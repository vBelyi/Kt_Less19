package com.example.kt_less19

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "todo")
data class ToDo (@PrimaryKey (autoGenerate = true) val id: Int? = null, val task: String)