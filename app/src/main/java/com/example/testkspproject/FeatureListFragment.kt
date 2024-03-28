package com.example.testkspproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.feature_1.Feature1Fragment

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
            listOf(
                FeatureItem(1, "Feature 1")
            )
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
            else -> {
                Feature1Fragment()
            }
        }
    }
}