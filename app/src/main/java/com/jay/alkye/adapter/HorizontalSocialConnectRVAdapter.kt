package com.jay.alkye.adapter

import com.jay.alkye.databinding.ItemHorizontalSocialConnectRvBinding


import android.graphics.Typeface
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.StyleSpan
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jay.alkye.Data
import com.jay.alkye.databinding.ItemHorizontalRvBinding

class HorizontalSocialConnectRVAdapter(private var list: List<String>) :
    RecyclerView.Adapter<HorizontalSocialConnectRVAdapter.SavedViewHolder>() {

    inner class SavedViewHolder(binding: ItemHorizontalSocialConnectRvBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val title = binding.tvTitle

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SavedViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemHorizontalSocialConnectRvBinding.inflate(inflater, parent, false)
        return SavedViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SavedViewHolder, position: Int) {
        val data = list[position]
        holder.title.text = data


    }

    override fun getItemCount(): Int {
        return list.size
    }

}