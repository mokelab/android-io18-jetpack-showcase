package com.mokelab.demo.io18.jetpacks.pages.items

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mokelab.demo.io18.jetpacks.databinding.ItemDetailFragmentBinding

class ItemDetailFragment : Fragment() {

    private lateinit var binding: ItemDetailFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        this.binding = ItemDetailFragmentBinding.inflate(inflater, container, false)
        return this.binding.root
    }
}