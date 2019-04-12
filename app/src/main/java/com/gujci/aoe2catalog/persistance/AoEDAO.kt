package com.gujci.aoe2catalog.persistance

import androidx.room.*
import com.gujci.aoe2catalog.model.Civilization
import com.gujci.aoe2catalog.model.Structure
import com.gujci.aoe2catalog.model.Technology
import com.gujci.aoe2catalog.model.Unit

@Dao
interface AoEDAO {

    // Civilizations
    @Query("SELECT * FROM civilizations")
    fun getCivilizations(): List<Civilization>

    @Insert
    fun insertCivilization(civilization: Civilization)

    @Update
    fun updateCivilizations(civilization: List<Civilization>)

    @Delete
    fun removeCivilization(civilization: Civilization)

    @Query("SELECT * FROM civilizations WHERE id = :id")
    fun findCivilizationById(id: Long): Civilization?

    // Structures
    @Query("SELECT * FROM structures")
    fun getStructures(): List<Structure>

    @Insert
    fun insertStructure(structure: Structure)

    @Update
    fun updateStructures(structure: List<Structure>)

    @Delete
    fun removeStructure(structure: Structure)

    @Query("SELECT * FROM structures WHERE id = :id")
    fun findStructureById(id: Long): Structure?

    // Technologies
    @Query("SELECT * FROM technologies")
    fun getTechnologies(): List<Technology>

    @Insert
    fun insertTechnology(technology: Technology)

    @Update
    fun updateTechnologies(technology: List<Technology>)

    @Delete
    fun removeTechnology(technology: Technology)

    @Query("SELECT * FROM technologies WHERE id = :id")
    fun findTechnologiesById(id: Long): Technology?

    // Unit
    @Query("SELECT * FROM units")
    fun getUnits(): List<Unit>

    @Insert
    fun insertUnit(unit: Unit)

    @Update
    fun updateUnits(units: List<Unit>)

    @Delete
    fun removeUnit(unit: Unit)

    @Query("SELECT * FROM units WHERE id = :id")
    fun findUnitById(id: Long): Unit?
}