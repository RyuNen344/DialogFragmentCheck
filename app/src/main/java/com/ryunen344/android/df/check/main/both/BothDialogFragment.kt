package com.ryunen344.android.df.check.main.both

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.ryunen344.android.df.check.databinding.DialogBothBinding
import timber.log.Timber
import timber.log.debug

class BothDialogFragment: DialogFragment() {

    private lateinit var binding: DialogBothBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DialogBothBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Timber.debug { "BothDialogFragment onViewCreated" }
        binding.label.text = this::class.java.name
        Timber.debug { "viewLifecycleOwner $viewLifecycleOwner" }
    }
}
