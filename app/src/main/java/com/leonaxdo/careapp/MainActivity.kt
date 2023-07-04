package com.leonaxdo.careapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var editTextID: EditText
    private lateinit var editTextPW: EditText
    private lateinit var loginBtn: Button
    private lateinit var signupBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextID = findViewById(R.id.editTextID)
        editTextPW = findViewById(R.id.editTextPW)
        loginBtn = findViewById(R.id.loginBtn)
        signupBtn = findViewById(R.id.signupBtn)

        loginBtn.setOnClickListener {
            val id = editTextID.text.toString()
            val pw = editTextPW.text.toString()

            when {
                id == "1" && pw == "1" -> {
                    // [근무자] 로그인
                    val intent = Intent(this@MainActivity, WorkerActivity::class.java)
                    startActivity(intent)
                }
                id == "2" && pw == "2" -> {
                    // [어르신] 로그인
                    val intent = Intent(this@MainActivity, ElderlyActivity::class.java)
                    startActivity(intent)
                }
                id == "3" && pw == "3" -> {
                    // [센터] 로그인
                    val intent = Intent(this@MainActivity, CenterActivity::class.java)
                    startActivity(intent)
                }
                else -> {
                    Toast.makeText(this@MainActivity, "ID 혹은 PW가 맞지 않습니다.", Toast.LENGTH_SHORT).show()
                }
            }
        }

        signupBtn.setOnClickListener {
            // 회원가입 버튼을 누를 경우 코딩 예정
            Toast.makeText(this@MainActivity, "회원가입 기능은 준비 중입니다.", Toast.LENGTH_SHORT).show()
        }
    }
}
