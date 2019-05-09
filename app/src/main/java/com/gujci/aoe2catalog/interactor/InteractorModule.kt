package com.gujci.aoe2catalog.interactor

import com.gujci.aoe2catalog.network.AoEApi
import com.gujci.aoe2catalog.persistance.AoEDAO
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class InteractorModule {
    @Provides
    @Singleton
    fun provideCatalogInteractor(api: AoEApi) = CatalogInteractor(api)
}