package com.gujci.aoe2catalog.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Unit(
        @PrimaryKey
        val id: Int,
        @Embedded
        val cost: Cost
)