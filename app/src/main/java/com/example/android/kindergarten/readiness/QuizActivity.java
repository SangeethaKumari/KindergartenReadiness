package com.example.android.kindergarten.readiness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This class performs the actions required to display the
 * quiz questions , answers and updating the score value.
 */

public class QuizActivity extends AppCompatActivity {


    private QuestionBank questionBank = new QuestionBank();
    private TextView questionView;
    private String mAnswer;
    private int score = 0;
    private int question = 0;
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    public static final int TOTAL_NUMBER_QUESTIONS = 11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        questionView = (TextView) findViewById(R.id.question);

    }

    /**
     * This method is called on click on next button.
     * This method gets the value of answer selected.
     * @param view
     */
    public void nextQuestion(View view) {
        radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        int selectedId = radioGroup.getCheckedRadioButtonId();
        radioButton = (RadioButton) findViewById(selectedId);
        if (radioButton == null) {
            Toast.makeText(QuizActivity.this, "Please select an answer to continue", Toast.LENGTH_SHORT).show();


        } else {
            // Is the button now checked?
            boolean checked = radioButton.isChecked();

            // Check which radio button was clicked
            switch (selectedId) {
                case R.id.choice1:
                    if (checked) {
                        score = score + 1;
                        break;
                    }
                case R.id.choice2:
                    if (checked) {
                        score = score + 2;
                        break;
                    }
                case R.id.choice3:
                    if (checked) {
                        score = score + 3;
                        break;
                    }
                case R.id.choice4:
                    if (checked) {
                        score = score + 4;
                        break;
                    }
            }
            if (question < TOTAL_NUMBER_QUESTIONS) { // checks whether there are still more questions to show
                radioGroup.clearCheck();
                // update with new questions
                updateQuestion();
            } else {
                if (score < 30) {
                    //call the result fail page
                    Intent intent = new Intent(this, ResultFailActivity.class);
                    startActivity(intent);
                } else {
                    //call the results success page
                    Intent intent = new Intent(this, ResultActivity.class);
                    startActivity(intent);
                }
            }
        }
    }


    public void homeScreen(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    /**
     * This method updates the question and answers in the
     * quiz activity view.
     */

    private void updateQuestion() {
        questionView.setText(questionBank.getQuestion(question));
        mAnswer = questionBank.getCorrectAnswer(question);
        question++;
    }
}