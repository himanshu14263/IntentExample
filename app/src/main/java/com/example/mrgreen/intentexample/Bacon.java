package com.example.mrgreen.intentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//  EXTRA HEADER FILES TO INCLUDE FOR THIS EXAMPLE /////////

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class Bacon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacon);

        Bundle appleData = getIntent().getExtras();
        if(appleData==null)
            return;

        String AppleMessage=appleData.getString("appleMessage");
        TextView baconText=(TextView)findViewById(R.id.BaconText);
        baconText.setText(AppleMessage);
    }

    public void onClick(View view)
    {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
