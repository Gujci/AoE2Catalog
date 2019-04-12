package com.gujci.aoe2catalog.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "technologies")
data class Technology(
        @PrimaryKey
        val id: Int,
        val name: String,
        val description: String?,
        val expansion: String,
        val age: String,
        val develops_in: String,
        val build_time: Int,
        @Embedded
        val cost: Cost
)