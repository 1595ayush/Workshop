package com.example.vaibhavi.first_application;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button submit;
    EditText name,age;
    String user_name;
    String name_value,age_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit=(Button)findViewById(R.id.submit);

        //Step 1
        name=(EditText)findViewById(R.id.name_edit);
        age=(EditText)findViewById(R.id.age_edit);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

          if( check_validation()) {
              Toast.makeText(MainActivity.this, "Submit",
                      Toast.LENGTH_SHORT).show();
              user_name = name.getText().toString();
              //Step 2
              name_value=name.getText().toString();
              age_value=age.getText().toString();





              //Call SecondActivity
              Intent intent = new Intent(MainActivity.this,
                      SecondActivity.class);
              //Key-Value Pair
              intent.putExtra("tag",user_name);
              intent.putExtra("tag2","hello");
              startActivity(intent);




          }

            }

        });


    }
    public boolean check_validation() {


        boolean ret=true;

        ret = Validation.isText(name);

        if (!ret)
        {
            name.requestFocus();
            ret=false;

        }


        return ret;
    }


}
