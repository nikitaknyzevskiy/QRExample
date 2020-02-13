package com.nikita.qrexample.unit.dagger

import android.content.Context
import com.nikita.qrexample.db.MyDatabase
import com.nikita.qrexample.rest.MyApiServer

interface MyResponseInteractor {

    fun myDataBase(): MyDatabase

    fun myApiService(): MyApiServer

}