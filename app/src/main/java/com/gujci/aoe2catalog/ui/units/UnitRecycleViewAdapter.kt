package com.gujci.aoe2catalog.ui.units

import android.view.View
import android.widget.TextView
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import com.gujci.aoe2catalog.R
import com.gujci.aoe2catalog.model.Unit
import com.gujci.aoe2catalog.ui.catalog.CatalogRecyclerViewAdapter
import com.gujci.aoe2catalog.ui.catalog.CatalogViewHolder
import com.gujci.aoe2catalog.ui.catalog.ListInteractionListener
import kotlinx.android.synthetic.main.fragment_civilization.view.*

class UnitRecycleViewAdapter (
        units: LiveData<List<Unit>>,
        listener: ListInteractionListener<Unit>,
        lifecycleOwner: LifecycleOwner)
    : CatalogRecyclerViewAdapter<Unit, UnitRecycleViewAdapter.ViewHolder>(units, listener, lifecycleOwner) {

        override fun getLayoutId(position: Int, obj: Unit): Int = R.layout.fragment_unit

        override fun getViewHolder(view: View, viewType: Int): ViewHolder = ViewHolder(view)

        inner class ViewHolder(mView: View) : CatalogViewHolder<Unit>(mView) {
            private val nameView: TextView = mView.name

            override fun setup(item: Unit) {
                nameView.text = item.name
            }
        }
    }