package com.gujci.aoe2catalog.ui.technologies

import android.view.View
import android.widget.TextView
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import com.gujci.aoe2catalog.R
import com.gujci.aoe2catalog.model.Technology
import com.gujci.aoe2catalog.ui.catalog.CatalogRecyclerViewAdapter
import com.gujci.aoe2catalog.ui.catalog.CatalogViewHolder
import com.gujci.aoe2catalog.ui.catalog.ListInteractionListener
import kotlinx.android.synthetic.main.fragment_civilization.view.*

class TechRecycleViewAdapter (
        technologies: LiveData<List<Technology>>,
        listener: ListInteractionListener<Technology>,
        lifecycleOwner: LifecycleOwner)
    : CatalogRecyclerViewAdapter<Technology, TechRecycleViewAdapter.ViewHolder>(technologies, listener, lifecycleOwner) {

    override fun getLayoutId(position: Int, obj: Technology): Int = R.layout.fragment_unit

    override fun getViewHolder(view: View, viewType: Int): ViewHolder = ViewHolder(view)

    inner class ViewHolder(mView: View) : CatalogViewHolder<Technology>(mView) {
        private val nameView: TextView = mView.name

        override fun setup(item: Technology) {
            nameView.text = item.name
        }
    }
}