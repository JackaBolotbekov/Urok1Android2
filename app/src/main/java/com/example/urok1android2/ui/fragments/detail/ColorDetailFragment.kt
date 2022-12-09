package com.example.urok1android2.ui.fragments.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.urok1android2.databinding.FragmentDetailColorBinding

class ColorDetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailColorBinding
    private val args by  navArgs<ColorDetailFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailColorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        colorInitial()
    }

    private fun colorInitial() = with(binding) {
        detailColor.let {
        Glide.with(it).load(args.color)
            .into(it)
        }
    }
}