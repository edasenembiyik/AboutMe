package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName("Eda Senem Biyik")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        // findViewById<Button>(R.id.select_button).setOnClickListener {
        //    addNickname(it)}
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.selectButton.setOnClickListener {
            (addNickname(it))
            binding.myName = myName
        }
    }

    private fun addNickname(view: View) {
//        val editText=findViewById<EditText>(R.id.nickname)
//        val nicknameText=findViewById<TextView>(R.id.nickname)

        binding.apply {

            binding.textView6.text=binding.nickname.text
            invalidateAll()
            nickname.visibility = View.GONE
            selectButton.visibility = View.GONE
            textView6.visibility = View.VISIBLE


            // Hide the keyboard.
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }
}