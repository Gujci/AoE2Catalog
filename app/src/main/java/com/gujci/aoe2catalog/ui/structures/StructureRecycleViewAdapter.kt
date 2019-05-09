package com.gujci.aoe2catalog.ui.structures

import android.view.View
import android.widget.TextView
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import com.gujci.aoe2catalog.R
import com.gujci.aoe2catalog.model.Structure
import com.gujci.aoe2catalog.ui.catalog.CatalogRecyclerViewAdapter
import com.gujci.aoe2catalog.ui.catalog.CatalogViewHolder
import com.gujci.aoe2catalog.ui.catalog.ListInteractionListener
import kotlinx.android.synthetic.main.fragment_civilization.view.*

class StructureRecycleViewAdapter(
        structures: LiveData<List<Structure>>,
        listener: ListInteractionListener<Structure>,
        lifecycleOwner: LifecycleOwner)
    : CatalogRecyclerViewAdapter<Structure, StructureRecycleViewAdapter.ViewHolder>(structures, listener, lifecycleOwner) {

    override fun getLayoutId(position: Int, obj: Structure): Int = R.layout.fragment_structure

    override fun getViewHolder(view: View, viewType: Int): ViewHolder = ViewHolder(view)

    inner class ViewHolder(mView: View) : CatalogViewHolder<Structure>(mView) {
        private val nameView: TextView = mView.name

        override fun setup(item: Structure) {
            nameView.text = item.name
        }
    }
}
