package com.leonaxdo.careapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ElderlyListAdapter(private val context: Context, private val elderlyList: List<String>) :
    RecyclerView.Adapter<ElderlyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElderlyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.elderly_item, parent, false)
        return ElderlyViewHolder(view)
    }

    override fun onBindViewHolder(holder: ElderlyViewHolder, position: Int) {
        holder.elderlyNameTextView.text = "${elderlyList[position]} 어르신"

        holder.currentItemLayout.setOnClickListener {
            val intent = Intent(context, ElderlyInfoActivity::class.java)
            intent.putExtra("elderlyName", elderlyList[position])
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = elderlyList.size
}
