package com.willo.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.willo.quizapp.UI.QuestionsActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.button)
        val editTextName = findViewById<EditText>(R.id.name)

        startButton.setOnClickListener {
            navigateQuestion(editTextName)
        }


    }

    private fun navigateQuestion(editTextName: EditText) {
        // validar q no este vacio el imput
        if (editTextName.text.isNotEmpty()){
            Intent(this, QuestionsActivity::class.java).also {
                val inputName = editTextName.text
                it.putExtra("sendNameQuestionActivity", inputName)
                startActivity(it)
                finish()
            }
        }else{
            Toast.makeText( this, "Please enter your name", Toast.LENGTH_SHORT).show()
        }
    }

    private fun sendNameBeginActivity(){

    }
}