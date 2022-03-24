package com.generation.todolist.model

data class Categoria (
    val id: Long,
    var descricao: String?,
    var tarefas: List<Tarefa>?) {

}