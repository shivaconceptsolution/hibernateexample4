package com.example.additionapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity9 extends AppCompatActivity {

    RadioButton rb1,rb2,rb3;
    Button btn;
    String s="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        rb1 = findViewById(R.id.rbbasic);
        rb2 = findViewById(R.id.rbadvance);
        rb3 = findViewById(R.id.rbplacement);
        btn = findViewById(R.id.btnradio);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(rb1.isChecked())
               {
                   s = rb1.getText().toString();
               }
               else if(rb2.isChecked())
               {
                   s = rb2.getText().toString();
               }
               else
               {
                   s = rb3.getText().toString();
               }

               Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
            }


        });

    }
}