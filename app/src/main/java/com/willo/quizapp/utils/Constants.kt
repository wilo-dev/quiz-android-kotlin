package com.willo.quizapp.utils

import com.willo.quizapp.R
import com.willo.quizapp.model.Question

object Constants {

    fun getQuestions(): MutableList<Question> {
        val questions = mutableListOf<Question>()
        val quest1 = Question(
            1,
            "What country does this flag belong?",
            R.drawable.alemania,
            "Alemaia",
            "Argelia",
            "Argentina",
            "Angola",
            1
        )
        questions.add(quest1)

        val quest2 = Question(
            2,
            "What country does this flag belong?",
            R.drawable.brazil,
            "Brazil",
            "Dinamarca",
            "Peru",
            "Holanda",
            1
        )
        questions.add(quest2)

        val quest3 = Question(
            3,
            "What country does this flag belong?",
            R.drawable.canada,
            "Costa rica",
            "Venezuela",
            "Canada",
            "Nicaragua",
            3
        )
        questions.add(quest3)

        val quest4 = Question(
            4,
            "What country does this flag belong?",
            R.drawable.ecuador,
            "Nicaragua",
            "Mexico",
            "Argentina",
            "Ecuador",
            4
        )
        questions.add(quest4)

        val quest5 = Question(
            5,
            "What country does this flag belong?",
            R.drawable.holanda,
            "Alemaia",
            "Argelia",
            "Holanda",
            "Angola",
            3
        )
        questions.add(quest5)

        val quest6 = Question(
            6,
            "What country does this flag belong?",
            R.drawable.polonia,
            "Alemaia",
            "Argelia",
            "Holanda",
            "Polonia",
            4
        )
        questions.add(quest6)

        val quest7 = Question(
            7,
            "What country does this flag belong?",
            R.drawable.peru,
            "Alemaia",
            "Peru",
            "Holanda",
            "Angola",
            2
        )
        questions.add(quest7)

        val quest8 = Question(
            8,
            "What country does this flag belong?",
            R.drawable.kazakhstan,
            "Alemaia",
            "Argelia",
            "Kazahstan",
            "Angola",
            3
        )
        questions.add(quest8)

        val quest9 = Question(
            9,
            "What country does this flag belong?",
            R.drawable.rusia,
            "Alemaia",
            "Argelia",
            "Holanda",
            "Rusia",
            4
        )
        questions.add(quest9)

        val quest10 = Question(
            10,
            "What country does this flag belong?",
            R.drawable.uruguay,
            "Uruguay",
            "Argelia",
            "Holanda",
            "Angola",
            1
        )
        questions.add(quest10)
        return questions
    }
}