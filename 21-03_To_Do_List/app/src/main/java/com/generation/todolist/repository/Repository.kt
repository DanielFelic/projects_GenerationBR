package com.generation.todolist.repository

import androidx.lifecycle.LiveData
import com.generation.todolist.api.RetrofitInstance
import com.generation.todolist.model.Categoria
import com.generation.todolist.model.Tarefa
import retrofit2.Response

class Repository {

    suspend fun listCategoria(): Response<List<Categoria>>{
        return RetrofitInstance.api.listCategoria()
    }

    suspend fun addTarefa(tarefa: Tarefa): Response<Tarefa>{
        return RetrofitInstance.api.addTarefa(tarefa)
    }

    suspend fun listTarefas() : Response<List<Tarefa>>{
        return RetrofitInstance.api.listTarefas()
    }
}