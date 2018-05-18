package com.mokelab.demo.io18.jetpacks.pages.top

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.mokelab.demo.io18.jetpacks.R
import com.mokelab.demo.io18.jetpacks.databinding.TopFragmentBinding

class TopFragment : Fragment() {

    private lateinit var binding: TopFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        this.binding = TopFragmentBinding.inflate(inflater, container, false)
        this.binding.button1.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_topFragment_to_itemListFragment))
        return this.binding.root
    }
}