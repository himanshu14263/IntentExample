package com.example.mrgreen.intentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//  EXTRA HEADER FILES TO INCLUDE FOR THIS EXAMPLE /////////

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view)
    {
        Intent i=new Intent(this,Bacon.class);
        final EditText AppleInput=(EditText)findViewById(R.id.AppleInput);

        String inputMessage=AppleInput.getText().toString();
        i.putExtra("appleMessage",inputMessage);

        startActivity(i);
    }
}
