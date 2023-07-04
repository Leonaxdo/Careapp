package com.leonaxdo.careapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ElderlyInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elderly_info)

        val elderlyName = intent.getStringExtra("elderlyName")
        val nameTextView = findViewById<TextView>(R.id.nameTextView)
        val birthTextView = findViewById<TextView>(R.id.birthTextView)
        val phoneTextView = findViewById<TextView>(R.id.phoneTextView)

        // DB에서 정보 가져와서 적용토록 수정해야 함.
        nameTextView.text = "$elderlyName 어르신"
        birthTextView.text = "생년월일: YYYY년 MM월 DD일"
        phoneTextView.text = "전화번호: 010-1234-5678"

        // 사진을 ImageView에 입력하는 로직 추가 필요
        val elderlyImageView = findViewById<ImageView>(R.id.elderlyImageView)
    }
}
