package com.gujci.aoe2catalog.ui

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import com.gujci.aoe2catalog.R
import com.gujci.aoe2catalog.model.Civilization

import kotlinx.android.synthetic.main.fragment_civilization.view.*

interface ListInteractionListener {
    fun onListFragmentInteraction(item: Civilization?)
}

class CivilizationRecyclerViewAdapter(
        private val civilisations: LiveData<List<Civilization>>,
        private val listener: ListInteractionListener,
        lifecycleOwner: LifecycleOwner)
    : RecyclerView.Adapter<CivilizationRecyclerViewAdapter.ViewHolder>() {

    private val singleGameOnClickListener: View.OnClickListener = View.OnClickListener {
        listener.onListFragmentInteraction(it.tag as Civilization)
    }

    init {
        civilisations.observe(lifecycleOwner, Observer {
            notifyDataSetChanged()
        })
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
            ViewHolder(LayoutInflater.from(parent.context)
                    .inflate(R.layout.fragment_civilization, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        civilisations.value?.getOrNull(position)?.let {
            holder.nameView.text = it.name
            holder.unitView.text = it.unique_unit.first()
            with(holder.mView) {
                this.tag = it
                setOnClickListener(singleGameOnClickListener)
            }
        }
    }

    override fun getItemCount(): Int = civilisations.value?.count() ?: 0

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val nameView: TextView = mView.name
        val unitView: TextView = mView.unique_unit
    }
}
