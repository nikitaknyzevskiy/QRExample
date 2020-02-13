package com.nikita.qrexample.unit.dagger

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class MyModule(private val context: Context) {

    @Provides
    //@Singleton
    fun provideMyResponseInteractor(): MyResponseInteractor {
        return MyResponseInteractorImp(context)
    }

}