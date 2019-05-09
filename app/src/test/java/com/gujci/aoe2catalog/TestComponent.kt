package com.gujci.aoe2catalog

import com.gujci.aoe2catalog.interactor.InteractorModule
import com.gujci.aoe2catalog.mock.MockNetworkModule
import com.gujci.aoe2catalog.network.NetworkModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MockNetworkModule::class, InteractorModule::class])
interface TestComponent {

    fun inject(catalogTest: CatalogTest)
}