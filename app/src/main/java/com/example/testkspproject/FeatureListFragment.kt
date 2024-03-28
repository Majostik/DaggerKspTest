package com.example.testkspproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.feature10.Feature10Fragment
import com.example.feature1.Feature1Fragment
import com.example.feature2.Feature2Fragment
import com.example.feature3.Feature3Fragment
import com.example.feature4.Feature4Fragment
import com.example.feature5.Feature5Fragment
import com.example.feature6.Feature6Fragment
import com.example.feature7.Feature7Fragment
import com.example.feature8.Feature8Fragment
import com.example.feature9.Feature9Fragment

class FeatureListFragment: Fragment() {

    private val adapter = FeatureListAdapter {
        onFeatureItemClick(it)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val list = view.findViewById<RecyclerView>(R.id.list)
        list.adapter = adapter
        list.layoutManager = LinearLayoutManager(context)


        adapter.submitList(
            buildList {
                for(i in 1 until 11) {
                    add( FeatureItem(i, "Feature $i"))
                }
            }
        )
    }

    private fun onFeatureItemClick(featureItem: FeatureItem) {
        val fragment = getFeature(featureItem)
        parentFragmentManager
            .beginTransaction()
            .replace(R.id.container, getFeature(featureItem))
            .addToBackStack(fragment.tag)
            .commit()
    }

    private fun getFeature(featureItem: FeatureItem): Fragment {
        return when(featureItem.id) {
            1 -> {
                Feature1Fragment()
            }
            2 -> {
                Feature2Fragment()
            }
            3 -> {
                Feature3Fragment()
            }
            4 -> {
                Feature4Fragment()
            }
            5 -> {
                Feature5Fragment()
            }
            6 -> {
                Feature6Fragment()
            }
            7 -> {
                Feature7Fragment()
            }
            8 -> {
                Feature8Fragment()
            }
            9 -> {
                Feature9Fragment()
            }
            10 -> {
                Feature10Fragment()
            }
            else -> {
                Feature1Fragment()
            }
        }
    }
}