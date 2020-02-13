package com.nikita.qrexample.unit

import com.nikita.qrexample.App
import com.nikita.qrexample.db.MyDatabase
import com.nikita.qrexample.rest.MyApiServer
import com.nikita.qrexample.unit.dagger.MyResponseInteractor
import javax.inject.Inject

open class BasicRespository {

    open lateinit var myDb: MyDatabase
    open lateinit var myApiService: MyApiServer

    @Inject
    lateinit var myResponseInteractor: MyResponseInteractor

    init {
        App.myComponent.inject(this)
        myDb = myResponseInteractor.myDataBase()
        myApiService = myResponseInteractor.myApiService()
    }

}