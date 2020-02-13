package com.nikita.qrexample.unit.dagger

import android.content.Context
import androidx.room.Room
import com.nikita.qrexample.MyConst
import com.nikita.qrexample.db.MyDatabase
import com.nikita.qrexample.rest.MyApiServer
import com.nikita.qrexample.unit.rest.AppRest

class MyResponseInteractorImp(private val context: Context) : MyResponseInteractor {

    override fun myDataBase(): MyDatabase {
        return Room
            .databaseBuilder<MyDatabase>(
                context, MyDatabase::class.java, "qr_example_db_nikita")
            .allowMainThreadQueries()
            .build()
    }

    override fun myApiService(): MyApiServer {
        return AppRest(MyConst.apiUrl, MyApiServer::class.java).api()
    }

}