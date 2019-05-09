package com.gujci.aoe2catalog.ui.technologies

import androidx.recyclerview.widget.RecyclerView
import com.gujci.aoe2catalog.R
import com.gujci.aoe2catalog.model.Technology
import com.gujci.aoe2catalog.ui.catalog.CatalogFragment
import com.gujci.aoe2catalog.ui.catalog.ListInteractionListener
import org.jetbrains.anko.toast

class TechFragment: CatalogFragment<Technology, TechRecycleViewAdapter.ViewHolder>(), ListInteractionListener<Technology> {

    override val adapter: RecyclerView.Adapter<TechRecycleViewAdapter.ViewHolder> by lazy {
        TechRecycleViewAdapter(viewModel.techList, this, this)
    }

    override val layout: Int by lazy {
        R.layout.fragment_unit_list
    }

    override fun onListFragmentInteraction(item: Technology?) {
        context?.toast("not implemented")
    }
}