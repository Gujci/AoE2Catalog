package com.gujci.aoe2catalog.persistance

import androidx.room.Database
import androidx.room.RoomDatabase
import com.gujci.aoe2catalog.model.Civilization
import com.gujci.aoe2catalog.model.Cost
import com.gujci.aoe2catalog.model.Structure
import com.gujci.aoe2catalog.model.Technology

@Database(
        entities = [Civilization::class, Structure::class, Technology::class, Unit::class, Cost::class],
        version = 1,
        exportSchema = false
)
abstract class Database : RoomDatabase() {

    abstract fun roomDao(): AoEDAO

}