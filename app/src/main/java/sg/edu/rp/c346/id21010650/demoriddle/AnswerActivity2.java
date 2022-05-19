package sg.edu.rp.c346.id21010650.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {

    TextView TextViewAnswer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        TextViewAnswer2 = findViewById(R.id.TextViewAnswer2);
        TextViewAnswer2.setText("In Second Activity");
        Intent intentReceived = getIntent();
        String questionsSelected2 = intentReceived.getStringExtra("Question");
        TextViewAnswer2.setText(questionsSelected2 + " answer is to add a g to 1.");
    }
}