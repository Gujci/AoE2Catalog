package com.gujci.aoe2catalog

import com.gujci.aoe2catalog.network.NetworkModule
import com.gujci.aoe2catalog.ui.CatalogViewModel
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface AppComponent {

    fun inject(catalogViewModel: CatalogViewModel)
}