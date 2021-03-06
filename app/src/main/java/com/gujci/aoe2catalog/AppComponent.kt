package com.gujci.aoe2catalog

import com.gujci.aoe2catalog.interactor.InteractorModule
import com.gujci.aoe2catalog.network.NetworkModule
import com.gujci.aoe2catalog.ui.catalog.CatalogViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, InteractorModule::class])
interface AppComponent {

    fun inject(catalogViewModel: CatalogViewModel)
}