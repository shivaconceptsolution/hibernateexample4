package com.example.additionapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity10 extends AppCompatActivity {


    CheckBox chk1,chk2,chk3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        chk1 = findViewById(R.id.chkc);
        chk2 = findViewById(R.id.chkcpp);
        chk3 = findViewById(R.id.chkds);

    }

    public  void fun(View v)
    {
        StringBuffer sb = new StringBuffer();
        if(chk1.isChecked())
        {
            sb.append(chk1.getText().toString() + " ");
        }
        if(chk2.isChecked())
        {
            sb.append(chk2.getText().toString() + " ");
        }
        if(chk3.isChecked())
        {
            sb.append(chk3.getText().toString() + " ");
        }

        Toast.makeText(getApplicationContext(),sb.toString(), Toast.LENGTH_SHORT).show();
    }
}