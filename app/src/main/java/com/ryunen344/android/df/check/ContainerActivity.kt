package com.ryunen344.android.df.check

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import timber.log.Timber
import timber.log.debug

class ContainerActivity : AppCompatActivity(R.layout.activity_container) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        findNavController(R.id.container_fragment).addOnDestinationChangedListener { _, destination, _ ->
            Timber.debug { "destination #$destination" }
        }
    }
}
