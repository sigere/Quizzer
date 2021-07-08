package com.siger.quizzer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Question question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.question = loadQuestion();
        displayQuestion(this.question);
    }

    public void checkAnswer(View view) {
        Button button = findViewById(view.getId());

        if(this.question.validate(button.getText().toString())) {
            Log.i("siger-debug", "dobra odpowiedz");
        }
        else {
            Log.i("siger-debug", "zla odpowiedz");
        }

    }

    private Question loadQuestion() {
        Question question = new Question();
        question.setText("2 + 2 * 2 =");
        HashSet<String> answers = new HashSet<String>();
        answers.add("4");
        answers.add("12");
        answers.add("8");
        answers.add("6");
        question.setAnswers(answers);
        question.setValidAnswer("6");

        return question;
    }

    private void displayQuestion(Question question) {
        TextView textView = findViewById(R.id.questionText);
        textView.setText(question.getText());

        List<String> answers = new ArrayList<String>(question.getAnswers());

        Button button;
        button = findViewById(R.id.answer_a);
        button.setText(answers.get(0));

        button = findViewById(R.id.answer_b);
        button.setText(answers.get(1));

        button = findViewById(R.id.answer_c);
        button.setText(answers.get(2));

        button = findViewById(R.id.answer_d);
        button.setText(answers.get(3));
    }
}