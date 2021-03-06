package com.gujci.aoe2catalog.ui.civilizations

import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.gujci.aoe2catalog.R
import com.gujci.aoe2catalog.model.Civilization
import com.gujci.aoe2catalog.ui.catalog.CatalogFragment
import com.gujci.aoe2catalog.ui.catalog.ListInteractionListener

class CivilizationFragment: CatalogFragment<Civilization, CivilizationRecyclerViewAdapter.ViewHolder>(),
        ListInteractionListener<Civilization> {

    override val adapter: RecyclerView.Adapter<CivilizationRecyclerViewAdapter.ViewHolder> by lazy {
        CivilizationRecyclerViewAdapter(viewModel.civilizationList, this, this)
    }

    override val layout: Int by lazy {
        R.layout.fragment_civilization_list
    }

    override fun onListFragmentInteraction(item: Civilization?) {
        viewModel.selectedCivilization.value = item
        findNavController().navigate(R.id.navigateToCivilizationDetail)
    }
}