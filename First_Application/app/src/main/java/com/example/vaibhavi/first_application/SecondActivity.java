package com.example.vaibhavi.first_application;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv_name = (TextView) findViewById(R.id.name_tv);

        /*call from another activity*/
        Intent intent1;
        intent1 = getIntent();
        String retrieved_name = intent1.getStringExtra("tag");
        String hello = intent1.getStringExtra("tag2");

        tv_name.setText(retrieved_name);
    }
}
