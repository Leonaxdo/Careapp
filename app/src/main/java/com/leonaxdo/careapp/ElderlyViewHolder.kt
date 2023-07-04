package com.leonaxdo.careapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.constraintlayout.widget.ConstraintLayout

class ElderlyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val elderlyNameTextView: TextView = itemView.findViewById(R.id.elderlyNameTextView)
    val currentItemLayout: ConstraintLayout = itemView.findViewById(R.id.currentItemLayout)
}
