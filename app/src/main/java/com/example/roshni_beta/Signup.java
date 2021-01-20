package com.example.roshni_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Signup extends AppCompatActivity {
    TextView register_login;
    EditText username,password,age;
    RadioGroup gender;
    Button signup;
    DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        signup=(Button)findViewById(R.id.login_button);
        gender=(RadioGroup) findViewById(R.id.gender);
        username=(EditText)findViewById(R.id.login_username);
        password=(EditText)findViewById(R.id.login_password);
        age=(EditText)findViewById(R.id.age);
        db=new DatabaseHelper(this);
        register_login=(TextView)findViewById(R.id.register_login);
        register_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login=new Intent(Signup.this,MainActivity.class);
                startActivity(login);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gen="";
                String user=username.getText().toString();
                String pass=password.getText().toString();
                String ag=age.getText().toString();
                int h=gender.getCheckedRadioButtonId();
                if(h !=-1){
                    RadioButton jb=(RadioButton)findViewById(h);
                    gen=jb.getText().toString();
                }

                long res=db.add_user(user,pass,gen,ag);
                if(res>0){
                    Intent login=new Intent(Signup.this,eye_acuity.class);
                    startActivity(login);
                }
                else{

                    Toast.makeText(Signup.this, "Registration Failed", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}
