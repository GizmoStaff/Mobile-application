package com.example.quizapp

object Constants {

    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS: String="total_questions"
    const val CORRECT_ANSWERS:String="correct_answers"



    fun getQuestions():ArrayList<Question>{
        val questionsList=ArrayList<Question>()
        val queOne=Question(
            1,"Which country does this dish belong to?",R.drawable.bacalhau,
            "Egypt",
            "Portugal",
            "Romania",
            "Spain",
            2

        )

        val queTwo=Question(
            2,"Which country does this dish belong to?", R.drawable.carbonara_pasta,
            "Slovenia",
            "Austria",
            "Italy",
            "Portugal",
            3
        )

        val queThree=Question(
            3,"Which country does this dish belong to?",R.drawable.ceviche,
            "Peru",
            "Spain",
            "India",
            "Philippines",
            1
        )

        val queFour=Question(
            4,"Which country does this dish belong to?",R.drawable.b_feijoada,
            "Peru",
            "Germany",
            "Slovenia",
            "Brazil",
            4

        )

        val queFive=Question(
            5,"Which country does this dish belong to?",R.drawable.fondue,
            "Italy",
            "British Isles",
            "Switzerland",
            "France",
            3
        )

        val queSix=Question(
            6,"Which country does this dish belong to?",R.drawable.goi_cuon,
            "Japan",
            "Vietnam",
            "South Korea",
            "Greece",
            2

        )

        val queSeven=Question(
            7,"Which country does this dish belong to?",R.drawable.jerk_chicken,
            "Jamaica",
            "Germany",
            "Vietnam",
            "Portugal",
            1
        )

        val queEight=Question(
            8, "Which country does this dish belong to?",R.drawable.kimchi,
            "Mexico",
            "India",
            "South Korea",
            "Peru",
            3
        )

        val queNine=Question(
            9,"Which country does this dish belong to?",R.drawable.koshari,
            "South Korea",
            "Ethiopia",
            "Egypt",
            "Mexico",
            3
        )

        val queTen=Question(
            10,"Which country does this dish belong to?",R.drawable.mansaf,
            "India",
            "Jordan",
            "Peru",
            "Pakistan",
            2
        )

        val queEleven=Question(
            11,"Which country does this dish belong to?",R.drawable.meat_pie,
            "Australia",
            "Serbia",
            "France",
            "Greece",
            1
        )
        val queTwelve=Question(
            12,"Which country does this dish belong to?",R.drawable.paneer_butter_masala,
            "Mexico",
            "Vietnam",
            "India",
            "Pakistan",
            3
        )

        val queThirteen=Question(
            13,"Which country does this dish belong to?",R.drawable.sushi,
            "Japan",
            "China",
            "Italy",
            "Portugal",
            1

        )

        val queFourteen=Question(
            14,"Which country does this dish belong to?",R.drawable.swedish_meatballs,
            "Germany",
            "Portugal",
            "Switzerland",
            "Sweden",
            4

        )

        val queFifteen=Question(
            15,"Which country does this dish belong to?",R.drawable.tom_yum_goong,
            "Spain",
            "Thailand",
            "Romania",
            "South Africa",
            2
        )

        val queSixteen=Question(
            16, "Which country does this dish belong to?",R.drawable.m_quesadilla,
            "France",
            "Greece",
            "Mexico",
            "Peru",
            3
        )

        questionsList.add(queOne)
        questionsList.add(queTwo)
        questionsList.add(queThree)
        questionsList.add(queFour)
        questionsList.add(queFive)
        questionsList.add(queSix)
        questionsList.add(queSeven)
        questionsList.add(queEight)
        questionsList.add(queNine)
        questionsList.add(queTen)
        questionsList.add(queEleven)
        questionsList.add(queTwelve)
        questionsList.add(queThirteen)
        questionsList.add(queFourteen)
        questionsList.add(queFifteen)
        questionsList.add(queSixteen)


        return questionsList

    }

}