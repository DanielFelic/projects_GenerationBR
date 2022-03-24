package com.generation.todolist.repository

import com.generation.todolist.api.RetrofitInstance
import com.generation.todolist.model.Categoria
import retrofit2.Response

class Repository {

    suspend fun listCategoria(): Response<List<Categoria>>{
        return RetrofitInstance.api.listCategoria()
    }
}