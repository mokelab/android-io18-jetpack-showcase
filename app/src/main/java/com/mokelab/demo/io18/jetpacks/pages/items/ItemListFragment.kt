package com.mokelab.demo.io18.jetpacks.pages.items

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mokelab.demo.io18.jetpacks.databinding.ItemListFragmentBinding

class ItemListFragment : Fragment() {
    private lateinit var binding: ItemListFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        this.binding = ItemListFragmentBinding.inflate(inflater, container, false)
        return this.binding.root
    }
}