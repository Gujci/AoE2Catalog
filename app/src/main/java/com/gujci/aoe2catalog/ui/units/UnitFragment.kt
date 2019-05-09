package com.gujci.aoe2catalog.ui.units

import androidx.recyclerview.widget.RecyclerView
import com.gujci.aoe2catalog.R
import com.gujci.aoe2catalog.model.Unit
import com.gujci.aoe2catalog.ui.catalog.CatalogFragment
import com.gujci.aoe2catalog.ui.catalog.ListInteractionListener
import org.jetbrains.anko.toast

class UnitFragment: CatalogFragment<Unit, UnitRecycleViewAdapter.ViewHolder>(), ListInteractionListener<Unit> {

    override val adapter: RecyclerView.Adapter<UnitRecycleViewAdapter.ViewHolder> by lazy {
        UnitRecycleViewAdapter(viewModel.unitList, this, this)
    }

    override val layout: Int by lazy {
        R.layout.fragment_unit_list
    }

    override fun onListFragmentInteraction(item: Unit?) {
        context?.toast("not implemented")
    }
}
