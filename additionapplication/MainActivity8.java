package com.example.additionapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity8 extends AppCompatActivity {

    Button btn1,btn2,btn3;
    TextView txtres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        btn1 = findViewById(R.id.btn21);
        btn2 = findViewById(R.id.btn22);
        btn3 = findViewById(R.id.btn23);
        txtres = findViewById(R.id.txtres22);
        btn1.setOnClickListener(new MyListner());
        btn2.setOnClickListener(new MyListner());
        btn3.setOnClickListener(new MyListner());
    }
    class MyListner implements View.OnClickListener
    {

        @Override
        public void onClick(View v) {
            if(v.getId() == R.id.btn21)
            {
                txtres.setText("YOU Are clicked in Button1");
            }

            else if(v.getId() == R.id.btn22)
            {
                txtres.setText("YOU Are clicked in Button2");
            }
            else
            {
                txtres.setText("YOU Are clicked in Button3");
            }

        }
    }
}