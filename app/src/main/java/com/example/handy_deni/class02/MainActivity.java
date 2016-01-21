package com.example.handy_deni.class02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("First App", "Lights Out Tonight");
        Toast.makeText(this, "Hello",Toast.LENGTH_LONG);
    }
}
