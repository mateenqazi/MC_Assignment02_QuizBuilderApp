package com.example.assignment02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        final Intent i = getIntent();
        Log.i("okay","okay");
        int count = i.getIntExtra("count",0);

        TextView textView= (TextView)findViewById(R.id.textView8);
        textView.setText(String.valueOf(count));

        TextView textView1= (TextView)findViewById(R.id.textView22);
        textView1.setText(String.valueOf(count*10)+"%");

        TextView textView2= (TextView)findViewById(R.id.textView24);
        if(count >=5){
            textView2.setText("Pass");
        }
        else{
            textView2.setText("Fail");
        }
    }
}