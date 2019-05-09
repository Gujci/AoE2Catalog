package com.gujci.aoe2catalog

import com.gujci.aoe2catalog.interactor.CatalogInteractor
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import javax.inject.Inject

@RunWith(RobolectricTestRunner::class)
class CatalogTest {

    @Inject
    lateinit var interactor: CatalogInteractor

    @Before
    @Throws(Exception::class)
    fun setup() {
        DaggerTestComponent.create().inject(this)
    }

    @Test
    fun getCivilizations() {
        val civilizations = runBlocking { interactor.loadCivilizations() }
        assert(civilizations.count() > 0)
    }
}