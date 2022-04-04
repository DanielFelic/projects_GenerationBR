package com.generation.todolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.generation.todolist.adapter.TarefaAdapter
import com.generation.todolist.adapter.TaskItemClickListener
import com.generation.todolist.databinding.FragmentListBinding
import com.generation.todolist.model.Tarefa


class ListFragment : Fragment(), TaskItemClickListener {

    private val mainViewModel : MainViewModel by activityViewModels()

    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        mainViewModel.listTarefas()

        binding = FragmentListBinding.inflate(
            layoutInflater, container, false
        )


        val adapter = TarefaAdapter(this, mainViewModel)

        binding.recyclerTarefa.layoutManager = LinearLayoutManager(context)

        binding.recyclerTarefa.adapter = adapter

        binding.recyclerTarefa.setHasFixedSize(true)

        binding.floatingActionButton.setOnClickListener {
            mainViewModel.tarefaSelecionada = null
            findNavController().navigate(R.id.action_listFragment_to_formFragment)
        }

        mainViewModel.myTarefaResponse.observe(viewLifecycleOwner, {
            response -> if (response != null){
                  adapter.setLista(response.body()!!)
            }
        })

        return binding.root
    }

    override fun onTaskClicked(tarefa: Tarefa) {
        mainViewModel.tarefaSelecionada = tarefa
        findNavController().navigate(R.id.action_listFragment_to_formFragment)
    }

}
