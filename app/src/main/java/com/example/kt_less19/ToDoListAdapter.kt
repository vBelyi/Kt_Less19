package com.example.kt_less19

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Update

class ToDoListAdapter (var items:List<ToDo> = emptyList()): RecyclerView.Adapter<ToDoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        val listItemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ToDoViewHolder(listItemView)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        holder.task.text = items[position].task

    }

    fun updateItems(itemsToUpdate: List<ToDo>) {
        items = itemsToUpdate
        notifyDataSetChanged()
    }

}

class ToDoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val task: TextView = itemView.findViewById(R.id.toDo)
}