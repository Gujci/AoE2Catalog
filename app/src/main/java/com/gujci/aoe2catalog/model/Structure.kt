package com.gujci.aoe2catalog.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Structure(
        @PrimaryKey
        val id: Int,
        val name: String,
        val description: String,
        val age: String,
        val build_time: Int,
        val hit_points: Int,
        val line_of_sight: Int,
        val armor: String,
        val range: String,
        val reload_time: Double,
        val attack: Int,
        @Embedded
        val cost: Cost
)