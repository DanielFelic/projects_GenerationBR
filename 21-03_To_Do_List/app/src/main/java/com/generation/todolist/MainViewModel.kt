package com.generation.todolist

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.generation.todolist.model.Categoria
import com.generation.todolist.model.Tarefa
import com.generation.todolist.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import java.time.LocalDate
import javax.inject.Inject
import kotlin.Exception

@HiltViewModel
class MainViewModel @Inject constructor(
        val repository: Repository
        ) : ViewModel() {

        private var _myCategoriaResponse =
            MutableLiveData<Response<List<Categoria>>>()

        val myCategoriaResponse: LiveData<Response<List<Categoria>>> =
            _myCategoriaResponse

        private val _myTarefaResponse =
            MutableLiveData<Response<List<Tarefa>>>()

        val myTarefaResponse: LiveData<Response<List<Tarefa>>> =
            _myTarefaResponse

        val dataSelecionada = MutableLiveData<LocalDate>()

        init {
            dataSelecionada.value = LocalDate.now()
            listCategoria()
        }

        fun listCategoria(){

            viewModelScope.launch {
                try {
                    val response = repository.listCategoria()
                    _myCategoriaResponse.value = response
                }catch (e: Exception){
                    Log.d("Erro", e.message.toString())
                }
            }
        }

        fun addTarefa(tarefa: Tarefa){
            viewModelScope.launch {
                try {
                    repository.addTarefa(tarefa)
                    listTarefas()
                }catch (e: Exception){
                    Log.d("Erro", e.message.toString())
                }
            }
        }

        fun listTarefas(){
            viewModelScope.launch {
                try {
                    val response = repository.listTarefas()
                    _myTarefaResponse.value = response
                }catch (e: Exception){
                    Log.e("Developer", "Error", e)
                }
            }
        }

}