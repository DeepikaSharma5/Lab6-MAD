package com.example.revisionlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button Btn1;
    EditText editext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Btn1 = findViewById(R.id.button);
        editext = findViewById(R.id.text1);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(MainActivity.this,ReadingCollections.class);
                intent.putExtra("name",editext.getText().toString());
                startActivity(intent);

            }
        });


    }
}
