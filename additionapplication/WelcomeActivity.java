package com.example.additionapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void navigateactivity(View v)
    {
       if(v.getId()==R.id.btnfirst )
       {
         Intent i = new Intent(getApplicationContext(),MainActivity.class);
         i.putExtra("rno",1001);
         i.putExtra("flag",false);

         startActivity(i);
       }
       else if(v.getId()==R.id.btnsecond )
        {
            Intent i = new Intent(getApplicationContext(),MainActivity2.class);
            startActivity(i);
        }
        else
        {
            Intent i = new Intent(getApplicationContext(),MainActivity5.class);
            startActivity(i);
        }
    }
}