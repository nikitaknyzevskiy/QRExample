package com.nikita.qrexample.unit.dagger

import android.content.Context
import androidx.room.Room
import com.nikita.qrexample.db.MyDatabase

class MyDBInteractorImp(private val context: Context) : MyDBInteractor {

    override fun myDataBase(): MyDatabase {
        return Room
            .databaseBuilder<MyDatabase>(
                context, MyDatabase::class.java, "qr_example_db_nikita")
            .allowMainThreadQueries()
            .build()
    }

}