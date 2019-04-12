package com.gujci.aoe2catalog.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gujci.aoe2catalog.model.Civilization
import com.gujci.aoe2catalog.model.Structure
import com.gujci.aoe2catalog.model.Technology
import com.gujci.aoe2catalog.model.Unit
import com.gujci.aoe2catalog.network.AoEApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

class CatalogViewModel : ViewModel(), CoroutineScope {
    @Inject
    lateinit var api: AoEApi

    private var job: Job = Job()

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + job

    fun detachView() = job.cancel()

    val civilizationList: LiveData<List<Civilization>> by lazy {
        MutableLiveData<List<Civilization>>()
    }

    val structuresList: LiveData<List<Structure>> by lazy {
        MutableLiveData<List<Structure>>()
    }

    val techList: LiveData<List<Technology>> by lazy {
        MutableLiveData<List<Technology>>()
    }

    val unitList: LiveData<List<Unit>> by lazy {
        MutableLiveData<List<Unit>>()
    }
}