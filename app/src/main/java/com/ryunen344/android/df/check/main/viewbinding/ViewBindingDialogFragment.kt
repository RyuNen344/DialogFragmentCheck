package com.ryunen344.android.df.check.main.viewbinding

import android.app.Dialog
import android.os.Bundle
import android.view.View
import androidx.fragment.app.DialogFragment
import com.ryunen344.android.df.check.R
import com.ryunen344.android.df.check.databinding.DialogViewBindingBinding
import com.wada811.viewbinding.viewBinding
import timber.log.Timber
import timber.log.debug

class ViewBindingDialogFragment: DialogFragment(R.layout.dialog_view_binding) {

    private val binding by viewBinding(DialogViewBindingBinding::bind)

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
//        setStyle(STYLE_NO_FRAME, R.style.MyDialog)
        return super.onCreateDialog(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Timber.debug { "ViewBindingDialogFragment onViewCreated" }
        binding.label.text = this::class.java.name
        Timber.debug { "viewLifecycleOwner $viewLifecycleOwner" }
    }
}
