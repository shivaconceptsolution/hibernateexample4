package com.example.additionapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity7 extends AppCompatActivity {

    LinearLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        ll = findViewById(R.id.lienarmain);
    }

    public void changecolor(View v)
    {
        if(v.getId() == R.id.btnbg1)
        {
           ll.setBackgroundColor(Color.BLUE);
        }
        if(v.getId() == R.id.btnbg2)
        {
           ll.setBackgroundColor(Color.GREEN);
        }
    }

}