package com.ryunen344.android.df.check.main.createdialog

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.ryunen344.android.df.check.R
import com.ryunen344.android.df.check.databinding.DialogCreateDialogBinding
import timber.log.Timber
import timber.log.debug

class CreateDialogDialogFragment: DialogFragment() {

    private lateinit var binding: DialogCreateDialogBinding

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        binding = DialogCreateDialogBinding.inflate(requireActivity().layoutInflater, null, false)
        return AlertDialog.Builder(requireContext(), R.style.MyDialog).apply {
            setView(binding.root)
        }.run {
            create()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Timber.debug { "CreateDialogDialogFragment onViewCreated" }
        binding.label.text = this::class.java.name
        Timber.debug { "onViewCreated viewLifecycleOwner $viewLifecycleOwner" }
    }
}
