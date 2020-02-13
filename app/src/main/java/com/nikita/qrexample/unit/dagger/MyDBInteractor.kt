package com.nikita.qrexample.unit.dagger

import android.content.Context
import com.nikita.qrexample.db.MyDatabase

interface MyDBInteractor {

    fun myDataBase(): MyDatabase

}