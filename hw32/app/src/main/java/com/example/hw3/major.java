package com.example.hw3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.bluetooth.BluetoothClass;
import android.content.ClipData;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class major extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_major);
        Button button = findViewById(R.id.buttono);
        final EditText editText1 = findViewById(R.id.name);
        final EditText editText2 = findViewById(R.id.age);
        final EditText editText3 = findViewById(R.id.no);
        final EditText editText4 = findViewById(R.id.mail);
        Button next = findViewById(R.id.next);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(major.this, MainActivity.class);

                startActivity(intent);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(major.this, print.class);
                intent1.putExtra("one", editText1.getText().toString());
                intent1.putExtra("two", editText2.getText().toString());
                intent1.putExtra("three", editText3.getText().toString());
                intent1.putExtra("five", editText4.getText().toString());
                startActivity(intent1);
            }
        });
    }

   
}