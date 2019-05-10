package com.gujci.aoe2catalog.ui.civilizations

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.google.firebase.analytics.FirebaseAnalytics
import com.gujci.aoe2catalog.MainActivity
import com.gujci.aoe2catalog.R
import com.gujci.aoe2catalog.ui.catalog.CatalogViewModel
import kotlinx.android.synthetic.main.fragment_civilization.name
import kotlinx.android.synthetic.main.fragment_civilization_detail.*
import org.jetbrains.anko.bundleOf

class CivilizationDetail : Fragment() {

    private val viewModel: CatalogViewModel by lazy {
        activity!!.let {
            ViewModelProviders.of(it).get(CatalogViewModel::class.java)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_civilization_detail, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.selectedCivilization.value?.let {
            name.text = it.name
            expansion.text = it.expansion
            bonuses.text = it.civilization_bonus.joinToString("\n\n")
            teamBonus.text = it.team_bonus

            MainActivity.firebaseAnalytics.logEvent(FirebaseAnalytics.Event.VIEW_ITEM,
                    bundleOf(FirebaseAnalytics.Param.ITEM_NAME to it.name))
        }
    }
}
