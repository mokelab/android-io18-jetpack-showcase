package com.mokelab.demo.io18.jetpacks.pages.items

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.mokelab.demo.io18.jetpacks.R
import com.mokelab.demo.io18.jetpacks.databinding.ItemListFragmentBinding
import com.mokelab.demo.io18.jetpacks.models.moke.Moke

class ItemListFragment : Fragment() {
    private lateinit var binding: ItemListFragmentBinding
    private lateinit var adapter: ItemListAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        this.binding = ItemListFragmentBinding.inflate(inflater, container, false)
        this.adapter = ItemListAdapter(inflater.context, this.listener)
        this.adapter.submitList(listOf(
                Moke(1, "青モケラ", "青いよ"),
                Moke(2, "赤モケラ", "赤いよ")
                ))
        this.binding.recycler.adapter = this.adapter
        this.binding.recycler.layoutManager = LinearLayoutManager(inflater.context, LinearLayoutManager.VERTICAL, false)
        return this.binding.root
    }

    private val listener = View.OnClickListener {
        val holder = this.binding.recycler.getChildViewHolder(it) as MokeViewHolder
        val args = Bundle()
        args.putInt("id", holder.binding.moke!!.id)

        Navigation.findNavController(it).navigate(R.id.action_itemListFragment_to_itemDetailFragment, args)
    }
}