package sg.edu.rp.c346.id21010650.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView TextQuestion1;
    TextView TextQuestion2;
    Button RevealQuestion1;
    Button RevealQuestion2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextQuestion1 = findViewById(R.id.TextQuestion1);
        TextQuestion2 = findViewById(R.id.TextQuestion2);
        RevealQuestion1 = findViewById(R.id.RevealQuestion1);
        RevealQuestion2 = findViewById(R.id.RevealQuestion2);

    RevealQuestion1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent( MainActivity.this, AnswerActivity1.class);
        intent.putExtra("Question", "Q1");
        startActivity(intent);

    RevealQuestion2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent2 = new Intent( MainActivity.this, AnswerActivity2.class);
        intent2.putExtra("Question", "Q2");
        startActivity(intent2);
        }
    });};});}}