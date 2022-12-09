package com.example.urok1android2.ui.fragments.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.ConcatAdapter
import com.example.urok1android2.databinding.FragmentMainBinding
import com.example.urok1android2.ui.adapters.NameAdapter
import com.example.urok1android2.ui.adapters.ColorAdapter
import com.example.urok1android2.ui.model.Model
import com.example.urok1android2.ui.repository.Repository


class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private lateinit var firstAdapter: NameAdapter
    private lateinit var secondAdapter: ColorAdapter
    private val repository = Repository()
    private lateinit var list: ArrayList<Model>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() {
        list = repository.getList()
        firstAdapter = NameAdapter(list, this::clickName)
        secondAdapter = ColorAdapter(list, this::clickColor)
        val concatAdapter = ConcatAdapter(firstAdapter, secondAdapter)
        binding.recyclerView.adapter = concatAdapter
    }

    private fun clickName(model: Model) {
        findNavController().navigate(
            MainFragmentDirections.actionMainFragmentToNameDetailFragment(
                model.name
            )
        )
    }

    private fun clickColor(model: Model) {
        findNavController().navigate(
            MainFragmentDirections.actionMainFragmentToColorDetailFragment(
                model.color
            )
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        list.clear()
    }
}