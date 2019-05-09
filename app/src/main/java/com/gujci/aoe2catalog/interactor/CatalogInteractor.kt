package com.gujci.aoe2catalog.interactor

import com.gujci.aoe2catalog.model.Civilization
import com.gujci.aoe2catalog.model.Structure
import com.gujci.aoe2catalog.model.Technology
import com.gujci.aoe2catalog.model.Unit
import com.gujci.aoe2catalog.network.AoEApi
import javax.inject.Inject

class CatalogInteractor @Inject constructor(private var api: AoEApi) {

    suspend fun loadCivilizations(): List<Civilization> = api.getCivilizations().civilizations

    suspend fun loadUnits(): List<Unit> = api.getUnits().units

    suspend fun loadTechnologies(): List<Technology> = api.getTechnologies().technologies

    suspend fun loadStructures(): List<Structure> = api.getStructures().structures
}