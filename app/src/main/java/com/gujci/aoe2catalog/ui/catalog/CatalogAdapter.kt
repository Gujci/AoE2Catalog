package com.gujci.aoe2catalog.ui.catalog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import com.gujci.aoe2catalog.model.Civilization

abstract class CatalogViewHolder<T: Any>(val mView: View): RecyclerView.ViewHolder(mView) {

    abstract fun setup(item: T)
}

interface ListInteractionListener {
    fun onListFragmentInteraction(item: Civilization?)
}

abstract class CatalogRecyclerViewAdapter<DataType: Any, ViewType: CatalogViewHolder<DataType>>(
        private val dataList: LiveData<List<DataType>>,
        private val listener: ListInteractionListener,
        lifecycleOwner: LifecycleOwner)
    : RecyclerView.Adapter<ViewType>() {

    abstract fun getViewHolder(view: View, viewType: Int): ViewType

    protected abstract fun getLayoutId(position: Int, obj: DataType): Int

    private val singleGameOnClickListener: View.OnClickListener = View.OnClickListener {
        listener.onListFragmentInteraction(it.tag as Civilization)
    }

    init {
        dataList.observe(lifecycleOwner, Observer {
            notifyDataSetChanged()
        })
    }

    override fun getItemViewType(position: Int): Int {
        return getLayoutId(position, dataList.value!![position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewType =
            getViewHolder(LayoutInflater.from(parent.context).inflate(viewType, parent, false), viewType)

    override fun onBindViewHolder(holder: ViewType, position: Int) {
        dataList.value?.getOrNull(position)?.let {
            holder.setup(it)
            with(holder.mView) {
                this.tag = it
                setOnClickListener(singleGameOnClickListener)
            }
        }
    }

    override fun getItemCount(): Int = dataList.value?.count() ?: 0
}
