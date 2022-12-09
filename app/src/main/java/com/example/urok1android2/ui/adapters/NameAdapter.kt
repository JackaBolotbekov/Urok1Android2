package com.example.urok1android2.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.urok1android2.databinding.ItemColorBinding
import com.example.urok1android2.databinding.ItemNameBinding
import com.example.urok1android2.ui.model.Model

class NameAdapter(

    private var list: List <Model>,
    private val click: (color: Model) -> Unit

) : RecyclerView.Adapter<NameAdapter.NameViewHolder>() {

    inner class NameViewHolder(private val binding: ItemNameBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            itemView.setOnClickListener {
                click(list[bindingAdapterPosition])
            }
        }

        fun onBind(model: Model) {
            binding.tvName.text = model.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
        val binding = ItemNameBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NameViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NameAdapter.NameViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}