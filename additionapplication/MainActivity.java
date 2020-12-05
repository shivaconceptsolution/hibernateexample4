package com.example.additionapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText t1,t2;
    Button btn;
    TextView txtres;
    int a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.txtnum1);
        t2 = findViewById(R.id.txtnum2);
        btn = findViewById(R.id.btnadd);
        txtres = findViewById(R.id.txtres);

        Bundle bundle = getIntent().getExtras();
        boolean bl = bundle.getBoolean("flag");
        int i = bundle.getInt("rno");
        if(bl)
        {
            txtres.setText("RNo is "+i);

        }
        else
        {
            txtres.setText("RNO IS NOT SET");
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(t1.getText().toString());  // to get from xml file to java varibale
                b = Integer.parseInt(t2.getText().toString());
                c = a+b;
                txtres.setText("Result is "+c);

            }
        });

    }
}