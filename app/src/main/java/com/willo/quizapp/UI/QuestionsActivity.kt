package com.willo.quizapp.UI

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import com.willo.quizapp.R
import com.willo.quizapp.model.Question
import com.willo.quizapp.utils.Constants

class QuestionsActivity : AppCompatActivity() {

    private lateinit var question_text_view: TextView
    private lateinit var image_flag: ImageView
    private lateinit var progressBar: ProgressBar
    private lateinit var text_view_progress: TextView
    private lateinit var text_view_option_one: TextView
    private lateinit var text_view_option_two: TextView
    private lateinit var text_view_option_three: TextView
    private lateinit var text_view_option_four: TextView
    private lateinit var btn_check: Button


    private val currentPosition = 1
    private lateinit var questionList: MutableList<Question>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        question_text_view = findViewById(R.id.question_text_view)
        image_flag = findViewById(R.id.image_flag)
        progressBar = findViewById(R.id.progressBar)
        text_view_progress = findViewById(R.id.text_view_progress)
        text_view_option_one = findViewById(R.id.text_view_option_one)
        text_view_option_two = findViewById(R.id.text_view_option_two)
        text_view_option_three = findViewById(R.id.text_view_option_three)
        text_view_option_four = findViewById(R.id.text_view_option_four)
        btn_check = findViewById(R.id.btn_check)


        questionList = Constants.getQuestions()
        Log.d("QuestionSize", "${questionList.size}")

        setQuestion()
    }

    private fun setQuestion() {
        // TODO: colocando la img
        val question = questionList[currentPosition - 1]
        image_flag.setImageResource(question.image)

        progressBar.progress = currentPosition
        text_view_progress.text = "$currentPosition/${progressBar.max}"
        question_text_view.text = question.question
        text_view_option_one.text = question.optionOne
        text_view_option_two.text = question.optionTwo
        text_view_option_three.text = question.optionThree
        text_view_option_four.text = question.optionFour
    }


}

