package com.example.roshni_beta;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class activity_1_test_1_level_select extends AppCompatActivity {

   Button level_1,level_2,level_3,level_4,level_5,level_6,level_7,level_8,level_9,level_10,level_11,level_12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_test_1_level_select);

        level_1=(Button)findViewById(R.id.level_1);
        level_2=(Button)findViewById(R.id.level_2);
        level_3=(Button)findViewById(R.id.level_3);
        level_4=(Button)findViewById(R.id.level_4);
        level_5=(Button)findViewById(R.id.level_5);
        level_6=(Button)findViewById(R.id.level_6);
        level_7=(Button)findViewById(R.id.level_7);
        level_8=(Button)findViewById(R.id.level_8);
        level_9=(Button)findViewById(R.id.level_9);
        level_10=(Button)findViewById(R.id.level_10);
        level_11=(Button)findViewById(R.id.level_11);
        level_12=(Button)findViewById(R.id.level_12);

        level_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder mbuilder = new AlertDialog.Builder(activity_1_test_1_level_select.this);
                View mview = getLayoutInflater().inflate(R.layout.instruction_1,null);
                Button next_button = (Button) mview.findViewById(R.id.next_1);
                next_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent login=new Intent(activity_1_test_1_level_select.this,activity_1_test_1.class);
                        startActivity(login);
                    }
                });

                mbuilder.setView(mview);
                AlertDialog dialog = mbuilder.create();
                dialog.show();


            }
        });

        level_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login=new Intent(activity_1_test_1_level_select.this,activity_1_test_1_level_2.class);
                startActivity(login);
            }
        });
        level_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login=new Intent(activity_1_test_1_level_select.this,activity_1_test_1_level_3.class);
                startActivity(login);
            }
        });
        level_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login=new Intent(activity_1_test_1_level_select.this,activity_1_test_1_level_4.class);
                startActivity(login);
            }
        });
        level_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login=new Intent(activity_1_test_1_level_select.this,activity_1_test_1_level_5.class);
                startActivity(login);
            }
        });
        level_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login=new Intent(activity_1_test_1_level_select.this,activity_1_test_1_level_6.class);
                startActivity(login);
            }
        });
        level_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login=new Intent(activity_1_test_1_level_select.this,activity_1_test_1_level_7.class);
                startActivity(login);
            }
        });

        level_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login=new Intent(activity_1_test_1_level_select.this,activity_1_test_1_level_8.class);
                startActivity(login);
            }
        });

        level_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login=new Intent(activity_1_test_1_level_select.this,activity_1_test_1_level_9.class);
                startActivity(login);
            }
        });

        level_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login=new Intent(activity_1_test_1_level_select.this,activity_1_test_1_level_10.class);
                startActivity(login);
            }
        });

        level_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login=new Intent(activity_1_test_1_level_select.this,activity_1_test_1_level_11.class);
                startActivity(login);
            }
        });

        level_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login=new Intent(activity_1_test_1_level_select.this,activity_1_test_1_level_12.class);
                startActivity(login);
            }
        });

    }
}
