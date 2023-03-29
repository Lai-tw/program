package com.example.mainactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ExplainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explain)
        val start=findViewById<Button>(R.id.start)
        start.setOnClickListener {
            val it= Intent(this,TestActivity::class.java)
            startActivity(it)
        }
    }
}