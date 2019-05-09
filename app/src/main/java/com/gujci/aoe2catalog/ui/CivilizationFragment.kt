package com.gujci.aoe2catalog.ui

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gujci.aoe2catalog.R
import com.gujci.aoe2catalog.model.Civilization
import com.gujci.aoe2catalog.ui.catalog.CatalogFragment
import com.gujci.aoe2catalog.ui.catalog.CatalogViewHolder
import kotlinx.android.synthetic.main.fragment_civilization.view.*

class CivilizationFragment: CatalogFragment<CivilizationRecyclerViewAdapter.ViewHolder>() {

    override val adapter: RecyclerView.Adapter<CivilizationRecyclerViewAdapter.ViewHolder> by lazy {
        CivilizationRecyclerViewAdapter(viewModel.civilizationList, this, this)
    }

    override val layout: Int by lazy {
        R.layout.fragment_civilization_list
    }
}