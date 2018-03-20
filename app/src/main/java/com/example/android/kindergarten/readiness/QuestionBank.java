package com.example.android.kindergarten.readiness;

/**
 * Created by sangeetha_gsk on 3/12/18.
 */

public class QuestionBank {

    private String mQuestions [] = {
            "Initiates his/her own leisure-time activities ?",
            "Can follow directions ?",
            "Can work independently ?",
            "Cuts with scissors.",
            "Can help dress himself/herself: coat, socks, shoes ?",
            "Is able to hop on one foot ?",
            "Tells full name when asked.",
            "Speaks in sentences.",
            "Listens with interest, to short story (10 minutes or more).",
            "Identifies Shapes: Circle, Square, Triangle, Rectangle",
            "Identifies basic colors: Red, Green, Blue, Orange."


};


    private String mChoices [][] = {
            {"1. Not Yet",	"2. Some of the time",	"3. Most of the time",	"4. Rarely misses this one"},
            {"1. Not Yet",	"2. Some of the time",	"3. Most of the time",	"4. Rarely misses this one"},
            {"1. Not Yet",	"2. Some of the time",	"3. Most of the time",	"4. Rarely misses this one"},
            {"1. Not Yet",	"2. Some of the time",	"3. Most of the time",	"4. Rarely misses this one"},
            {"1. Not Yet",	"2. Some of the time",	"3. Most of the time",	"4. Rarely misses this one"},
            {"1. Not Yet",	"2. Some of the time",	"3. Most of the time",	"4. Rarely misses this one"},
            {"1. Not Yet",	"2. Some of the time",	"3. Most of the time",	"4. Rarely misses this one"},
            {"1. Not Yet",	"2. Some of the time",	"3. Most of the time",	"4. Rarely misses this one"},
            {"1. Not Yet",	"2. Some of the time",	"3. Most of the time",	"4. Rarely misses this one"},
            {"1. Not Yet",	"2. Some of the time",	"3. Most of the time",	"4. Rarely misses this one"},
            {"1. Not Yet",	"2. Some of the time",	"3. Most of the time",	"4. Rarely misses this one"},

    };



    private String mCorrectAnswers[] = {"1", "3", "3",
            "1","1", "3", "3",  "1","2",  "2","2"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
