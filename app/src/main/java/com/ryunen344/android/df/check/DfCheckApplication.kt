package com.ryunen344.android.df.check

import android.app.Application
import timber.log.LogcatTree
import timber.log.Timber

class DfCheckApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(LogcatTree())
    }
}
