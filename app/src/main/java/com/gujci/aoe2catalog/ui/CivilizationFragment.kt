package com.gujci.aoe2catalog.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import com.gujci.aoe2catalog.R
import com.gujci.aoe2catalog.model.Civilization

class CivilizationFragment : Fragment(), ListInteractionListener {

    private lateinit var viewModel: CatalogViewModel
    private lateinit var adapter: CivilizationRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = activity?.run {
            ViewModelProviders.of(this).get(CatalogViewModel::class.java)
        } ?: throw Exception("Invalid Activity")

        viewModel.civilizationList.observe(this, Observer {
            adapter.notifyDataSetChanged()
        })
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_civilization_list, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        adapter = CivilizationRecyclerViewAdapter(viewModel.civilizationList, this)
        with(view as RecyclerView) {
            this.adapter = adapter
        }
    }

    override fun onListFragmentInteraction(item: Civilization?) {
        TODO("navigate to detail")
    }

    companion object {
        @JvmStatic
        fun newInstance() = CivilizationFragment()
    }
}
