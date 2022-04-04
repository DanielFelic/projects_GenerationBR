package com.generation.todolist.adapter

import com.generation.todolist.model.Tarefa

interface TaskItemClickListener {

    fun onTaskClicked(tarefa: Tarefa)


}