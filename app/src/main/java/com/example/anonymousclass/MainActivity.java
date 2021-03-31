package com.example.anonymousclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mbutton1;
    TextView mtextveiw1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbutton1.findViewById(R.id.button1);
        mtextveiw1.findViewById(R.id.textView1);

        mbutton1.setOnClickListener(new MyOnClickListener());
    }

    private class MyOnClickListener implements View.OnClickListener {
   @Override
        public void onClick(View v){
       mtextveiw1.setText(("You clicked button1"));
        }
    }
}