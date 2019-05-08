package com.gujci.aoe2catalog.ui

import androidx.recyclerview.widget.RecyclerView
import com.gujci.aoe2catalog.R
import com.gujci.aoe2catalog.ui.catalog.CatalogFragment

class CivilizationFragment: CatalogFragment<CivilizationRecyclerViewAdapter.ViewHolder>() {

    override val adapter: RecyclerView.Adapter<CivilizationRecyclerViewAdapter.ViewHolder> by lazy {
        CivilizationRecyclerViewAdapter(viewModel.civilizationList, this, this)
    }

    override val layout: Int by lazy {
        R.layout.fragment_civilization_list
    }
}
