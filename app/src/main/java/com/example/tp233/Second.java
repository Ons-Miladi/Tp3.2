package com.example.tp233;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Second extends AppCompatActivity {
private ImageView imgView;
private TextView text;



    protected void onCreate(Bundle savedInstanceState,int position) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        imgView=(ImageView)findViewById(R.id.imageView);
        text=(TextView) findViewById(R.id.textView3);


        Intent i=getIntent();

     String a=i.getStringExtra("rec");
       text.setText(a);
  /*
      String b=i.getStringExtra("2");

        text.setText(String.valueOf(b));

        String c=i.getStringExtra("3");

        text.setText(String.valueOf(c));

*/




    }
}