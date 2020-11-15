package com.example.assignment02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity11 extends AppCompatActivity {
    RadioGroup radioGroup;
    Button button;
    RadioButton rdb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        final Intent i = getIntent();
        final String answer = "10";
        button = findViewById(R.id.button11);
        radioGroup = findViewById(R.id.radioGroup10);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int count1 = i.getIntExtra("count",0);
                if (radioGroup.getCheckedRadioButtonId() == -1) {

                    Toast toast = Toast.makeText(getApplicationContext(), "Please Mark the mcqs", Toast.LENGTH_SHORT);
                    toast.show();
                } else {

                    int selectedId = radioGroup.getCheckedRadioButtonId();
                    rdb = findViewById(selectedId);

                    String ans = rdb.getText().toString();
                    if (ans.equals(answer)) {
                        count1++;
                    }
                    Intent i = new Intent(MainActivity11.this, MainActivity12.class);

                    i.putExtra("count", count1);
                    startActivity(i);

                }
            }
        });
    }
}