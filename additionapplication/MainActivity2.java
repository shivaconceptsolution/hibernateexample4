package com.example.additionapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText et1,et2,et3;
    Button btn;
    TextView txtres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        et1 = findViewById(R.id.txtp);
        et2 = findViewById(R.id.txtr);
        et3 = findViewById(R.id.txtt);
        btn = findViewById(R.id.btncalc);
        txtres = findViewById(R.id.txtresult);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    float p,r,t,si;
                    p = Float.parseFloat(et1.getText().toString());
                    r = Float.parseFloat(et2.getText().toString());
                    t = Float.parseFloat(et3.getText().toString());
                    si = (p*r*t)/100;
                    txtres.setText("Result is "+si);

                }
                catch(Exception ex)
                {
                    txtres.setText(ex.getMessage().toString());
                    //Log.d(null,ex.getMessage().toString());
                }


            }
        });



    }
}