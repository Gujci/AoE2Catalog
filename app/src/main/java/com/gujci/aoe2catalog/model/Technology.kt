package com.gujci.aoe2catalog.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "technologies")
data class Technology(
        @PrimaryKey
        val id: Int,
        @Embedded
        val cost: Cost
)