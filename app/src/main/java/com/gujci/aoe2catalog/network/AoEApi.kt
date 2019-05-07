package com.gujci.aoe2catalog.network

import com.gujci.aoe2catalog.model.*
import com.gujci.aoe2catalog.model.Unit
import retrofit2.http.GET
import retrofit2.http.Path

interface AoEApi {

    @GET("civilizations")
    suspend fun getCivilizations(): CivilizationList

    @GET("units")
    suspend fun getUnits(): UnitList

    @GET("structures")
    suspend fun getStructures(): StructureList

    @GET("technologies")
    suspend fun getTechnologies(): TechnologyList

    @GET("civilization/{id}")
    suspend fun getCivilization(@Path("id") id: Int): Civilization

    @GET("unit/{id}")
    suspend fun getUnit(@Path("id") id: Int): Unit

    @GET("structure/{id}")
    suspend fun getStructure(@Path("id") id: Int): Structure

    @GET("technology/{id}")
    suspend fun getTechnology(@Path("id") id: Int): Technology
}