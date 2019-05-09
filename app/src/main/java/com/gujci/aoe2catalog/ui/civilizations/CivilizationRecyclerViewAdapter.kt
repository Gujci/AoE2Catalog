package com.gujci.aoe2catalog.ui.civilizations

import android.view.View
import android.widget.TextView
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import com.gujci.aoe2catalog.R
import com.gujci.aoe2catalog.model.Civilization
import com.gujci.aoe2catalog.ui.catalog.CatalogRecyclerViewAdapter
import com.gujci.aoe2catalog.ui.catalog.CatalogViewHolder
import com.gujci.aoe2catalog.ui.catalog.ListInteractionListener
import kotlinx.android.synthetic.main.fragment_civilization.view.*

class CivilizationRecyclerViewAdapter(
        civilisations: LiveData<List<Civilization>>,
        listener: ListInteractionListener<Civilization>,
        lifecycleOwner: LifecycleOwner)
: CatalogRecyclerViewAdapter<Civilization, CivilizationRecyclerViewAdapter.ViewHolder>(civilisations, listener, lifecycleOwner) {

    override fun getLayoutId(position: Int, obj: Civilization): Int = R.layout.fragment_civilization

    override fun getViewHolder(view: View, viewType: Int): ViewHolder = ViewHolder(view)

    inner class ViewHolder(mView: View) : CatalogViewHolder<Civilization>(mView) {
        private val nameView: TextView = mView.name

        override fun setup(item: Civilization) {
            nameView.text = item.name
        }
    }
}
