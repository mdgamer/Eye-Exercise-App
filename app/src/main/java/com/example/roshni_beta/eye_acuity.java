package com.example.roshni_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class eye_acuity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_acuity);

        btn= (Button)findViewById(R.id.acuity_button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(eye_acuity.this, "User Successfully Registered", Toast.LENGTH_SHORT).show();
                Intent login=new Intent(eye_acuity.this, MainActivity.class);
                startActivity(login);
            }
        });
    }
}
