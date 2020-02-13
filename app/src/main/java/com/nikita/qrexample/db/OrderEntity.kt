package com.nikita.qrexample.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class OrderEntity(
    @PrimaryKey
    val id: String
)