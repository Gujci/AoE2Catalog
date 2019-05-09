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

    @Test
    fun getUnits() {
        val units = runBlocking { interactor.loadUnits() }
        assert(units.count() > 0)
    }

    @Test
    fun getStructures() {
        val structures = runBlocking { interactor.loadStructures() }
        assert(structures.count() > 0)
    }

    @Test
    fun getTechnologies() {
        val technologies = runBlocking { interactor.loadTechnologies() }
        assert(technologies.count() > 0)
    }
}