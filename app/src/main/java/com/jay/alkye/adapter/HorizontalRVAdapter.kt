package com.jay.alkye.adapter

import android.graphics.Typeface
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.StyleSpan
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jay.alkye.Data
import com.jay.alkye.databinding.ItemHorizontalRvBinding

class HorizontalRVAdapter(private var list: List<Data>) :
    RecyclerView.Adapter<HorizontalRVAdapter.SavedViewHolder>() {

    inner class SavedViewHolder(binding: ItemHorizontalRvBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val category = binding.tvCategory
        val title = binding.tvTitle
        val time = binding.tvTime

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SavedViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemHorizontalRvBinding.inflate(inflater, parent, false)
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