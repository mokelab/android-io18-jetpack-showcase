package com.mokelab.demo.io18.jetpacks.pages.items

import android.content.Context
import android.support.v7.recyclerview.extensions.ListAdapter
import android.support.v7.util.DiffUtil
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mokelab.demo.io18.jetpacks.databinding.MokeItemBinding
import com.mokelab.demo.io18.jetpacks.models.moke.Moke

class ItemListAdapter(context: Context, val listener: View.OnClickListener) : ListAdapter<Moke, MokeViewHolder>(ItemListAdapter.DiffCallback) {
    private val inflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MokeViewHolder {
        val binding = MokeItemBinding.inflate(this.inflater, parent, false)
        binding.root.setOnClickListener(this.listener)
        return MokeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MokeViewHolder, position: Int) {
        holder.binding.moke = getItem(position)
    }

    object DiffCallback : DiffUtil.ItemCallback<Moke>() {
        override fun areItemsTheSame(oldItem: Moke, newItem: Moke): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Moke, newItem: Moke): Boolean {
            return oldItem.name == newItem.name
        }

    }
}