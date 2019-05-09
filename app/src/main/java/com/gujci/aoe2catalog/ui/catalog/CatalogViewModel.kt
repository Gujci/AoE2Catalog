package com.gujci.aoe2catalog.ui.catalog

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gujci.aoe2catalog.DaggerAppComponent
import com.gujci.aoe2catalog.interactor.CatalogInteractor
import com.gujci.aoe2catalog.model.Civilization
import com.gujci.aoe2catalog.model.Structure
import com.gujci.aoe2catalog.model.Technology
import com.gujci.aoe2catalog.model.Unit
import kotlinx.coroutines.*
import javax.inject.Inject

class CatalogViewModel : ViewModel() {

    @Inject
    lateinit var interactor: CatalogInteractor

    init {
        DaggerAppComponent.create().inject(this)
    }

    val civilizationList: LiveData<List<Civilization>> by lazy {
        MutableLiveData<List<Civilization>>().also {
            viewModelScope.launch {
                it.postValue(interactor.loadCivilizations())
            }
        }
    }

    val structuresList: LiveData<List<Structure>> by lazy {
        MutableLiveData<List<Structure>>().also {
            viewModelScope.launch {
                it.postValue(interactor.loadStructures())
            }
        }
    }

    val techList: LiveData<List<Technology>> by lazy {
        MutableLiveData<List<Technology>>().also {
            viewModelScope.launch {
                it.postValue(interactor.loadTechnologies())
            }
        }
    }

    val unitList: LiveData<List<Unit>> by lazy {
        MutableLiveData<List<Unit>>().also {
            viewModelScope.launch {
                it.postValue(interactor.loadUnits())
            }
        }
    }
}