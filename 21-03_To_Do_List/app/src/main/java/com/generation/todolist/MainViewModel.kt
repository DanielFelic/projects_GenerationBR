package com.generation.todolist

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.generation.todolist.model.Categoria
import com.generation.todolist.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
        val repository: Repository
        ) : ViewModel() {

        private var _myCategoriaResponse =
            MutableLiveData<Response<List<Categoria>>>()

        val myCategoriaResponse: LiveData<Response<List<Categoria>>> =
            _myCategoriaResponse

        init {
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

}