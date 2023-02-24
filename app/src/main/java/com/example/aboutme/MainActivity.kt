package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private fun addNickname(view: View){
        val editText=findViewById<EditText>(R.id.nickname)
        val nicknameText=findViewById<TextView>(R.id.nickname)

        nicknameText.text=editText.text
        editText.visibility=View.GONE
        view.visibility=View.GONE
        nicknameText.visibility=View.VISIBLE
    }
}