package com.example.urok1android2.ui.fragments.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.urok1android2.databinding.FragmentDetailNameBinding

class NameDetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailNameBinding
    private val args by  navArgs<NameDetailFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailNameBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nameInitial()
    }

    private fun nameInitial() = with(binding) {
        detailName.text = args.name
    }
}