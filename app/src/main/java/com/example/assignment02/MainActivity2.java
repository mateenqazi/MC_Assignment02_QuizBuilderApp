package com.example.assignment02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    static int count = 0;
    RadioGroup radioGroup;
    Button button;
    RadioButton rdb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final String answer = "Muhammad Ali Jinnah";
        radioGroup = findViewById(R.id.radioGroup);
        button = findViewById(R.id.button2);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (radioGroup.getCheckedRadioButtonId() == -1) {
                        Toast toast = Toast.makeText(getApplicationContext(), "Please Mark the mcqs", Toast.LENGTH_SHORT);
                        toast.show();
                    } else {
                        int selectedId = radioGroup.getCheckedRadioButtonId();
                        rdb = findViewById(selectedId);

                        String ans = rdb.getText().toString();
                        if (ans.equals(answer)) {
                            count++;
                        }
                        Intent i = new Intent(MainActivity2.this, MainActivity3.class);
                        i.putExtra("count", count);
                        startActivity(i);

                    }
                }
            });

    }
}