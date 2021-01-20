package com.example.roshni_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_1 extends AppCompatActivity {
    Button test1,test2,test3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        test1=(Button)findViewById(R.id.test_1);
        test2=(Button)findViewById(R.id.test_2);
        test3=(Button)findViewById(R.id.test_3);
        test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login=new Intent(Activity_1.this,activity_1_test_1_level_select.class);
                startActivity(login);
            }
        });

        test2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login=new Intent(Activity_1.this,Alphabets.class);
                startActivity(login);
            }
        });

        test3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login=new Intent(Activity_1.this,activity_1_test_3.class);
                startActivity(login);
            }
        });
    }
}
