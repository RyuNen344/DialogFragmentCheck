package com.ryunen344.android.df.check.main.createview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.ryunen344.android.df.check.databinding.DialogCreateViewBinding
import timber.log.Timber
import timber.log.debug

class CreateViewDialogFragment: DialogFragment() {

    private lateinit var binding: DialogCreateViewBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DialogCreateViewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Timber.debug { "CreateViewDialogFragment onViewCreated" }
        binding.label.text = this::class.java.name
        Timber.debug { "viewLifecycleOwner $viewLifecycleOwner" }
    }
}
