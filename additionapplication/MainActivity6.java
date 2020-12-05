package com.example.additionapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity6 extends AppCompatActivity {

    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        img1 = findViewById(R.id.imgsrc);

    }

    public void showimage(View v)
    {
        if(v.getId() == R.id.btnimg1)
        {
          img1.setImageResource(R.drawable.bg);
        }
        else if(v.getId() == R.id.btnimg2)
        {
            img1.setImageResource(R.drawable.sss);
        }

    }
}