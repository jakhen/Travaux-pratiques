package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class activityQuiz extends AppCompatActivity {
    ListView listview;
    ArrayList<String> items;
    ArrayAdapter<String> adapter;

    EditText input;
    ImageView validateNewItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        listview = findViewById(R.id.listview);
        input = findViewById(R.id.itemInput);
        validateNewItem = findViewById(R.id.imageAdd);
        items = new ArrayList<>();
        items.add("Python");
        items.add("Java");
        items.add("Html");
        items.add("Php");
        items.add("C++");
        adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, items);
        listview.setAdapter(adapter);

        validateNewItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text =input.getText().toString();
                if(text == null || text.length() == 0){
                    makeToast("Veuillez saisir l'Element à ajouter");
                }
                else{
                    addItem(text);
                    input.setText("");
                    makeToast(text+" a été ajouté");

                }
            }
        });

    }
    public void addItem(String item){
        items.add(item);
        listview.setAdapter(adapter);
    }
    Toast t;
    private void makeToast(String s){
        if(t != null) t.cancel();
        t= Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT);
        t.show();
    }
}