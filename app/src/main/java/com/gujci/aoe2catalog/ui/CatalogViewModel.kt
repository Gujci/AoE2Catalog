package com.gujci.aoe2catalog.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gujci.aoe2catalog.model.Civilization
import com.gujci.aoe2catalog.model.Structure
import com.gujci.aoe2catalog.model.Technology
import com.gujci.aoe2catalog.model.Unit
import com.gujci.aoe2catalog.network.AoEApi
import kotlinx.coroutines.*
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

class CatalogViewModel : ViewModel() {

    @Inject
    lateinit var api: AoEApi

    val civilizationList: LiveData<List<Civilization>> by lazy {
        val result = MutableLiveData<List<Civilization>>()
        viewModelScope.launch {
            result.postValue(api.getCivilizations().civilizations)
        }
        return@lazy result
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