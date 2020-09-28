package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class print extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print);
        TextView textView= findViewById(R.id.print1);
        TextView textView1= findViewById(R.id.print2);
        TextView textView2= findViewById(R.id.print3);
        TextView textView3= findViewById(R.id.print4);
        Button backy=findViewById(R.id.back);
        Bundle b= getIntent().getExtras();




        textView.setText(b.getString("one"));
        textView1.setText(b.getString("two"));
        textView2.setText(b.getString("three"));
        textView3.setText(b.getString("five"));








        backy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(print.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}