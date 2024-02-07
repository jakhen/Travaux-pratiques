package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    protected Button btn_Validate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Validate = findViewById(R.id.Btn_Validate);

    }
    //envoyer
    public void toActivityQuiz(View view){
        Intent myIntent=new Intent(this,activityQuiz.class);
        startActivity(myIntent);

    }
}