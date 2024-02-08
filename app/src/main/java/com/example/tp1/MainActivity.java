package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    protected Button mBtn_Validate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtn_Validate = findViewById(R.id.Btn_Validate);
        //mBtn_Validate.setEnabled(false);
        mBtn_Validate.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.Btn_Validate){
            //Toast.makeText(MainActivity.this, "Button Validate clicked2",Toast.LENGTH_SHORT).show();
            Intent myIntent=new Intent(this,activityQuiz.class);
            startActivity(myIntent);
        }

    }

}