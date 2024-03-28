package com.example.testkspproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class FeaturesDiffUtil: DiffUtil.ItemCallback<FeatureItem>() {
    override fun areItemsTheSame(oldItem: FeatureItem, newItem: FeatureItem): Boolean =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: FeatureItem, newItem: FeatureItem): Boolean =
        oldItem == newItem

}

class FeatureListAdapter(
    private val onItemClickListener: (FeatureItem) -> Unit
): ListAdapter<FeatureItem, FeatureListAdapter.FeatureViewHolder>(FeaturesDiffUtil()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeatureViewHolder {
        return FeatureViewHolder(
            itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_feature, parent, false),
            onItemClickListener = onItemClickListener
        )
    }

    override fun onBindViewHolder(holder: FeatureViewHolder, position: Int) {
        holder.bind(currentList[position])
    }

    class FeatureViewHolder(
        private val itemView: View,
        private val onItemClickListener: (FeatureItem) -> Unit
    ): ViewHolder(itemView) {

        private val title = itemView.findViewById<TextView>(R.id.feature_text)

        fun bind(featureItem: FeatureItem) {
            title.text = featureItem.title
            itemView.setOnClickListener {
                onItemClickListener.invoke(featureItem)
            }
        }
    }
}