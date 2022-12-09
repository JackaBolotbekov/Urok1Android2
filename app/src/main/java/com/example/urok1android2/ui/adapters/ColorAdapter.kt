package com.example.urok1android2.ui.adapters

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.urok1android2.databinding.ItemColorBinding
import com.example.urok1android2.ui.model.Model

class ColorAdapter(

    private var list: List <Model>,
    private val click: (color: Model) -> Unit

) : RecyclerView.Adapter<ColorAdapter.ColorViewHolder>() {

    inner class ColorViewHolder(private val binding: ItemColorBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            itemView.setOnClickListener {
                click(list[bindingAdapterPosition])
            }
        }

        fun onBind(model: Model) {
            Glide.with(binding.ivColor.context)
                .load(model.color)
                .into(binding.ivColor)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColorViewHolder {
        val binding = ItemColorBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ColorViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ColorViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}


