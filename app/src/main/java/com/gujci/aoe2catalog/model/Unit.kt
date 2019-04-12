package com.gujci.aoe2catalog.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Unit(
        @PrimaryKey
        val id: Int,
        val name: String,
        val expansion: String,
        val age: String,
        val created_in: String,
        val build_time: Int,
        val reload_time: Double,
        val attack_delay: Double?,
        val movement_rate: Double,
        val line_of_sight: Int,
        val hit_points: Int,
        val range: String?,
        val attack: Int,
        val armor: String,
        val attack_bonus: List<String>,
        val armor_bonus: List<String>,
        val search_radius: Int,
        val accuracy: String,
        val blast_radius: Double,
        @Embedded
        val cost: Cost
)