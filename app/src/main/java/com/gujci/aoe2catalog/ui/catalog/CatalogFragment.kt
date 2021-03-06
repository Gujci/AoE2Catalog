package com.gujci.aoe2catalog.ui.catalog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gujci.aoe2catalog.model.Civilization

abstract class CatalogFragment<DataType: Any, ViewType: RecyclerView.ViewHolder>: Fragment() {

    abstract val adapter: RecyclerView.Adapter<ViewType>
    abstract val layout: Int

    lateinit var viewModel: CatalogViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = activity?.run {
            ViewModelProviders.of(this).get(CatalogViewModel::class.java)
        } ?: throw Exception("Invalid Activity")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
            inflater.inflate(layout, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val adapter = adapter
        with(view as RecyclerView) {
            this.adapter = adapter
            this.layoutManager = LinearLayoutManager(context)
        }
    }
}