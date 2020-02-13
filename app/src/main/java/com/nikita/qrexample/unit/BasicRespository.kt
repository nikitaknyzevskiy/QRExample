package com.nikita.qrexample.unit

import com.nikita.qrexample.App
import com.nikita.qrexample.db.MyDatabase
import com.nikita.qrexample.unit.dagger.MyDBInteractor
import javax.inject.Inject

open class BasicRespository {

    open lateinit var myDb: MyDatabase

    @Inject
    lateinit var myDBInteractor: MyDBInteractor

    init {
        App.myComponent.inject(this)
        myDb = myDBInteractor.myDataBase()
    }

}