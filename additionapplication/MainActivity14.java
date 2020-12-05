package com.example.additionapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity14 extends AppCompatActivity {

    EditText txt1,txt2;
    Button btn,btn1;
    List<Student> stu= new ArrayList<Student>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        txt1 = findViewById(R.id.txtr1);
        txt2 = findViewById(R.id.txtr2);
        btn1 = findViewById(R.id.btnadd);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              stu.add(new Student(Integer.parseInt(txt1.getText().toString()),txt2.getText().toString()));
            }
        });
        btn = findViewById(R.id.btnfinal);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(Student st:stu)
                {
                    Toast.makeText(getApplicationContext(),"Rno is "+st.getRno() + " Name is "+st.getSname(),Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}