package sg.edu.rp.c346.id21010650.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {

    TextView TextViewAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        TextViewAnswer = findViewById(R.id.TextViewAnswer);
        TextViewAnswer.setText("In Second Activity");
        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");
        TextViewAnswer.setText(questionsSelected + " answer is Queue.");
    }
}