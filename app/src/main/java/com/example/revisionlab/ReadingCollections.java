package com.example.revisionlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class ReadingCollections extends AppCompatActivity {

    String name;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_collections);

        Intent intent = getIntent();
        intent.getStringExtra("name");

        Toast.makeText(this,"Welcome "+name+ " Please enter what you read",Toast.LENGTH_SHORT).show();




    }
}
