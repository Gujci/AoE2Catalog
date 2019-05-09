package com.gujci.aoe2catalog.ui.structures

import androidx.recyclerview.widget.RecyclerView
import com.gujci.aoe2catalog.R
import com.gujci.aoe2catalog.model.Structure
import com.gujci.aoe2catalog.ui.catalog.CatalogFragment
import com.gujci.aoe2catalog.ui.catalog.ListInteractionListener
import org.jetbrains.anko.toast

class StructureFragment: CatalogFragment<Structure, StructureRecycleViewAdapter.ViewHolder>(),
        ListInteractionListener<Structure> {

    override val adapter: RecyclerView.Adapter<StructureRecycleViewAdapter.ViewHolder> by lazy {
        StructureRecycleViewAdapter(viewModel.structuresList, this, this)
    }

    override val layout: Int by lazy {
        R.layout.fragment_structure_list
    }

    override fun onListFragmentInteraction(item: Structure?) {
        context?.toast("not implemented")
    }
}