package com.jay.alkye.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jay.alkye.Data
import com.jay.alkye.databinding.ItemHorizontalRvBinding
import com.jay.alkye.databinding.ItemVerticalRvBinding

class VerticalRVAdapter(private var list: List<Data>) :
    RecyclerView.Adapter<VerticalRVAdapter.SavedViewHolder>() {

    inner class SavedViewHolder(binding: ItemVerticalRvBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val category = binding.tvCategory
        val title = binding.tvTitle
        val time = binding.tvTime

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SavedViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemVerticalRvBinding.inflate(inflater, parent, false)
        return SavedViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SavedViewHolder, position: Int) {
        val data = list[position]

        holder.category.text = data.category
        holder.title.text = data.title
        holder.time.text = data.time

    }

    override fun getItemCount(): Int {
        return list.size
    }

}