package com.leonaxdo.careapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class WorkerActivity : AppCompatActivity() {

    class WorkerActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_worker)

            val recyclerView = findViewById<RecyclerView>(R.id.elderlyRecyclerView)

            val elderlyList = arrayOf("장동일", "김신자", "천월자", "박경훈")
            val elderlyListAdapter = ElderlyListAdapter(this, elderlyList.toMutableList())
            recyclerView.adapter = elderlyListAdapter
            recyclerView.layoutManager = LinearLayoutManager(this)
        }
    }
}
