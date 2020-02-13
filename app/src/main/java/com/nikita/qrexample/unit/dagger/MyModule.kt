package com.nikita.qrexample.unit.dagger

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MyModule(private val context: Context) {

    @Provides
    //@Singleton
    fun provideMyDbInteractor(): MyDBInteractor {
        return MyDBInteractorImp(context)
    }

}