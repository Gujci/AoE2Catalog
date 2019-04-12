package com.gujci.aoe2catalog.model

import androidx.room.Entity

@Entity
data class Cost(val Wood: Int,val Food: Int, val Gold: Int, var Stone: Int)