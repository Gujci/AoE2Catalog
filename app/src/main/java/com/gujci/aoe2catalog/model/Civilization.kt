package com.gujci.aoe2catalog.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Civilization(
        @PrimaryKey
        val id: Int,
        val name: String,
        val expansion: String,
        val army_type: String,
        val unique_unit: List<String>,
        val unique_tech: List<String>,
        val team_bonus: String,
        val civilization_bonus: List<String>)