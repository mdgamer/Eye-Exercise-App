package com.example.roshni_beta;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Button login;
    TextView register;
    DatabaseHelper db;
    Boolean savelogin;
    //@Override
    public  MainActivity(){

    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db=new DatabaseHelper(this);
        login=(Button)findViewById(R.id.login_button);
        register=(TextView) findViewById(R.id.login_register);
        username=(EditText)findViewById(R.id.login_username);
        password=(EditText)findViewById(R.id.login_password);
        sharedPreferences=getSharedPreferences("loginref",MODE_PRIVATE);
        editor= sharedPreferences.edit();
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent register=new Intent(MainActivity.this,Signup.class);
                startActivity(register);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=username.getText().toString();
                String pass=password.getText().toString();
                Boolean res=db.check_user(user,pass);
                if(res==false){

                    Toast.makeText(MainActivity.this, "username or password incorrect", Toast.LENGTH_SHORT).show();
                }
                else{
                    // Toast.makeText(MainActivity.this, "username and password correct", Toast.LENGTH_SHORT).show();
                    editor.putBoolean("savelogin",true);
                    editor.putString("username",user);
                    editor.putString("password",pass);
                    editor.commit();
                    Intent home=new Intent(MainActivity.this,Home.class);
                    startActivity(home);
                }
            }
        });
    }
}
