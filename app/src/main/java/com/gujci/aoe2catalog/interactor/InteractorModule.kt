package com.gujci.aoe2catalog.interactor

import com.gujci.aoe2catalog.network.AoEApi
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class InteractorModule {
    @Provides
    @Singleton
    fun provideCatalogInteractor(artistsApi: AoEApi) = CatalogInteractor(artistsApi)
}