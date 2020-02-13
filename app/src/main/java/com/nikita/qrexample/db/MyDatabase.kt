package com.nikita.qrexample.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [OrderEntity::class], version = 1, exportSchema = false)
abstract class MyDatabase : RoomDatabase() {

}