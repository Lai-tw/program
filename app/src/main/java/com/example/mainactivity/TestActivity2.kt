package com.example.mainactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts

class TestActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2)
        val submit = findViewById<Button>(R.id.submit)
        val previous_question=findViewById<Button>(R.id.previous_question)

        var test2=registerForActivityResult(ActivityResultContracts.StartActivityForResult()){ result->
            if(result.resultCode== RESULT_OK){
                val mydata:Intent?=result.data
                if (mydata!=null){
                    Log.d("twoActivity","Mydata:"+mydata.getStringExtra("result"))
                }
            }
        }
        previous_question.setOnClickListener {v->
            val it=Intent(this,TestActivity::class.java).apply {

            }
        }

        //test2.launch(it)

        submit.setOnClickListener {
            val it = Intent(this, ResultActivity::class.java)
            startActivity(it)
        }
    }
}