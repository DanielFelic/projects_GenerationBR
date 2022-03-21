package com.generation.todolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.generation.todolist.adapter.TarefaAdapter
import com.generation.todolist.model.Tarefa


class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_list, container, false)

        val listTarefas = mutableListOf(
            Tarefa(
                "Estudar Pentest",
                "Estudar para certificado eJPT",
                "Daniel",
                "2022-22-03",
                false,
                "Estudo"
            ),
            Tarefa(
                "Levar lixo",
                "Levar lixo da semana",
                "Daniel",
                "2022-24-03",
                false,
                "Dia a dia"
            ),
            Tarefa(
                "Lavar Roupa",
                "Lavar roupas pretas e coloridas",
                "Daniel",
                "2022-26-03",
                false,
                "Dia a dia"
            )
        )

        val recyclerTarefa = view.findViewById<RecyclerView>(R.id.recyclerTarefa)

        val adapter = TarefaAdapter()

        recyclerTarefa.layoutManager = LinearLayoutManager(context)

        recyclerTarefa.adapter = adapter

        recyclerTarefa.setHasFixedSize(true)

        adapter.setLista(listTarefas)

        return view
    }

}
