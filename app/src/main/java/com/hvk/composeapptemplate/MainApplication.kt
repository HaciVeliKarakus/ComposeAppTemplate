package com.hvk.composeapptemplate

import android.app.Application
import com.hvk.composeapptemplate.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.component.KoinComponent
import org.koin.core.context.GlobalContext.startKoin

class MainApplication : Application(), KoinComponent {

    override fun onCreate() {
        super.onCreate()

        startKoin {

            androidContext(this@MainApplication)
            modules(appModule)
        }
    }
}