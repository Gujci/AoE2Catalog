package com.gujci.aoe2catalog.model

data class Civilization(val id: Int,
                        val name: String,
                        val expansion: String,
                        val army_type: String,
                        val unique_unit: String,
                        val unique_tech: String,
                        val team_bonus: String,
                        val civilization_bonus: List<String>)