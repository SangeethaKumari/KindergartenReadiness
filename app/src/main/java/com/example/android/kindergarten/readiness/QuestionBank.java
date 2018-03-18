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



    private String mCorrectAnswers[] = {"2", "3", "3",
            "1","4", "3", "3",  "4","2",  "2","2"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
