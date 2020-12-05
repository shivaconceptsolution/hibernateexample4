package com.example.additionapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    private Button btn1,btn2,btn3,btn4;
    private EditText txt1,txt2;
    int num1,num2,num3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btn1 = findViewById(R.id.btnadd);
        btn2 = findViewById(R.id.btnsub);
        btn3 = findViewById(R.id.btnmulti);
        btn4 = findViewById(R.id.btndiv);
     /*   btn1.setOnClickListener(new MyListner());
        btn2.setOnClickListener(new MyListner());
        btn3.setOnClickListener(new MyListner());
        btn4.setOnClickListener(new MyListner());*/
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);

    }
    public void btnoperation(View v)
    {
        if(txt1.getText().toString().length()==0)
        {
            txt1.setError("Enter First number");
        }
        else if(txt2.getText().toString().length()==0)
        {
            txt2.setError("Enter Second Number");
        }
        else {
            if (v.getId() == R.id.btnadd) {
                num3 = Integer.parseInt(txt1.getText().toString()) + Integer.parseInt(txt2.getText().toString());

            } else if (v.getId() == R.id.btnsub) {
                num3 = Integer.parseInt(txt1.getText().toString()) - Integer.parseInt(txt2.getText().toString());

            } else if (v.getId() == R.id.btnmulti) {
                num3 = Integer.parseInt(txt1.getText().toString()) * Integer.parseInt(txt2.getText().toString());
            } else {
                num3 = Integer.parseInt(txt1.getText().toString()) / Integer.parseInt(txt2.getText().toString());
            }

            Toast.makeText(getApplicationContext(), "Result is " + num3, Toast.LENGTH_LONG).show();
        }
    }

  /*  class MyListner implements View.OnClickListener
    {

        @Override
        public void onClick(View v) {

            if(v.getId()==R.id.btnadd)
            {
                num3 = Integer.parseInt(txt1.getText().toString()) + Integer.parseInt(txt2.getText().toString());

            }
            else if(v.getId()==R.id.btnsub)
            {
                num3 = Integer.parseInt(txt1.getText().toString()) - Integer.parseInt(txt2.getText().toString());

            }
            else if(v.getId()==R.id.btnmulti)
            {
                num3 = Integer.parseInt(txt1.getText().toString())*Integer.parseInt(txt2.getText().toString());
            }
            else
            {
                num3 = Integer.parseInt(txt1.getText().toString())/Integer.parseInt(txt2.getText().toString());
            }

            Toast.makeText(getApplicationContext(),"Result is "+num3,Toast.LENGTH_LONG).show();
        }
    }*/

}