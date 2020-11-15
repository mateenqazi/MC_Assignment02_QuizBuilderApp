package com.example.assignment02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    RadioGroup radioGroup;
    Button button;
    RadioButton rdb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        final Intent i = getIntent();
        final String answer = "lahore";
        button = findViewById(R.id.button4);
        radioGroup = findViewById(R.id.radioGroup3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int count1 = i.getIntExtra("count",0);
                Log.i("Okay1","okay1");
                if (radioGroup.getCheckedRadioButtonId() == -1) {
                    Log.i("Okay","okay");
                    Toast toast = Toast.makeText(getApplicationContext(), "Please Mark the mcqs", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    Log.i("Okay2","okay2");
                    int selectedId = radioGroup.getCheckedRadioButtonId();
                    rdb = findViewById(selectedId);

                    String ans = rdb.getText().toString();
                    if (ans.equals(answer)) {
                        count1++;
                    }
                    Intent i = new Intent(MainActivity4.this, MainActivity5.class);
                    i.putExtra("count", count1);
                    startActivity(i);

                }
            }
        });



    }
}