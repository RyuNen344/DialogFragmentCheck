package com.ryunen344.android.df.check.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ryunen344.android.df.check.R
import com.ryunen344.android.df.check.databinding.FragmentMainBinding
import com.wada811.viewbinding.viewBinding

class MainFragment: Fragment(R.layout.fragment_main) {

    private val binding by viewBinding(FragmentMainBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.buttonBoth.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.toBothDialogFragment())
        }

        binding.buttonCreateDialog.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.toCreateDialogDialogFragment())
        }

        binding.buttonCreateView.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.toCreateViewDialogFragment())
        }

        binding.buttonViewBinding.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.toViewBindingDialogFragment())
        }
    }
}
