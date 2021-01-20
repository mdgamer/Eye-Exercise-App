package com.example.roshni_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.view.animation.Animation;
import android.widget.TextView;

public class activity_1_test_2 extends AppCompatActivity {
    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txt12,txt13,txt14,txt15,txt16,txt17,txt18,txt19,txt20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_test_2);
        txt1=(TextView)findViewById(R.id.txt1);
        txt2=(TextView)findViewById(R.id.txt2);
        txt3=(TextView)findViewById(R.id.txt3);
        txt4=(TextView)findViewById(R.id.txt4);
        txt5=(TextView)findViewById(R.id.txt5);
        txt6=(TextView)findViewById(R.id.txt6);
        txt7=(TextView)findViewById(R.id.txt7);
        txt8=(TextView)findViewById(R.id.txt8);
        txt9=(TextView)findViewById(R.id.txt9);
        txt10=(TextView)findViewById(R.id.txt10);
        txt11=(TextView)findViewById(R.id.txt11);
        txt12=(TextView)findViewById(R.id.txt12);
        txt13=(TextView)findViewById(R.id.txt13);
        txt14=(TextView)findViewById(R.id.txt14);
        txt15=(TextView)findViewById(R.id.txt15);
        txt16=(TextView)findViewById(R.id.txt16);
        txt17=(TextView)findViewById(R.id.txt17);
        txt18=(TextView)findViewById(R.id.txt18);
        txt19=(TextView)findViewById(R.id.txt19);
        txt20=(TextView)findViewById(R.id.txt20);


        ObjectAnimator oba= ObjectAnimator.ofInt(txt1,"backgroundColor",Color.YELLOW,Color.RED);
        ObjectAnimator oba2= ObjectAnimator.ofInt(txt2,"backgroundColor", Color.RED,Color.YELLOW);
        ObjectAnimator oba3= ObjectAnimator.ofInt(txt3,"backgroundColor", Color.YELLOW,Color.RED);
        ObjectAnimator oba4= ObjectAnimator.ofInt(txt4,"backgroundColor", Color.RED,Color.YELLOW);
        ObjectAnimator oba5= ObjectAnimator.ofInt(txt5,"backgroundColor", Color.RED,Color.YELLOW);
        ObjectAnimator oba6= ObjectAnimator.ofInt(txt6,"backgroundColor", Color.YELLOW,Color.RED);
        ObjectAnimator oba7= ObjectAnimator.ofInt(txt7,"backgroundColor", Color.RED,Color.YELLOW);
        ObjectAnimator oba8= ObjectAnimator.ofInt(txt8,"backgroundColor", Color.YELLOW,Color.RED);
        ObjectAnimator oba9= ObjectAnimator.ofInt(txt9,"backgroundColor", Color.YELLOW,Color.RED);
        ObjectAnimator oba10= ObjectAnimator.ofInt(txt10,"backgroundColor",Color.RED,Color.YELLOW);
        ObjectAnimator oba11= ObjectAnimator.ofInt(txt11,"backgroundColor", Color.YELLOW,Color.RED);
        ObjectAnimator oba12= ObjectAnimator.ofInt(txt12,"backgroundColor", Color.RED,Color.YELLOW);
        ObjectAnimator oba13= ObjectAnimator.ofInt(txt13,"backgroundColor", Color.RED,Color.YELLOW);
        ObjectAnimator oba14= ObjectAnimator.ofInt(txt14,"backgroundColor", Color.YELLOW,Color.RED);
        ObjectAnimator oba15= ObjectAnimator.ofInt(txt15,"backgroundColor", Color.RED,Color.YELLOW);
        ObjectAnimator oba16= ObjectAnimator.ofInt(txt16,"backgroundColor",  Color.YELLOW,Color.RED);
        ObjectAnimator oba17= ObjectAnimator.ofInt(txt17,"backgroundColor", Color.YELLOW,Color.RED);
        ObjectAnimator oba18= ObjectAnimator.ofInt(txt18,"backgroundColor", Color.RED,Color.YELLOW);
        ObjectAnimator oba19= ObjectAnimator.ofInt(txt19,"backgroundColor", Color.YELLOW,Color.RED);
        ObjectAnimator oba20= ObjectAnimator.ofInt(txt20,"backgroundColor", Color.RED,Color.YELLOW);
        oba.setDuration(500);
        oba2.setDuration(500);
        oba3.setDuration(500);
        oba4.setDuration(500);
        oba5.setDuration(500);
        oba6.setDuration(500);
        oba7.setDuration(500);
        oba8.setDuration(500);
        oba9.setDuration(500);
        oba10.setDuration(500);
        oba11.setDuration(500);
        oba12.setDuration(500);
        oba13.setDuration(500);
        oba14.setDuration(500);
        oba15.setDuration(500);
        oba16.setDuration(500);
        oba17.setDuration(500);
        oba18.setDuration(500);
        oba19.setDuration(500);
        oba20.setDuration(500);
        oba.setEvaluator(new ArgbEvaluator());
        oba2.setEvaluator(new ArgbEvaluator());
        oba3.setEvaluator(new ArgbEvaluator());
        oba4.setEvaluator(new ArgbEvaluator());
        oba5.setEvaluator(new ArgbEvaluator());
        oba6.setEvaluator(new ArgbEvaluator());
        oba7.setEvaluator(new ArgbEvaluator());
        oba8.setEvaluator(new ArgbEvaluator());
        oba9.setEvaluator(new ArgbEvaluator());
        oba10.setEvaluator(new ArgbEvaluator());
        oba11.setEvaluator(new ArgbEvaluator());
        oba12.setEvaluator(new ArgbEvaluator());
        oba13.setEvaluator(new ArgbEvaluator());
        oba14.setEvaluator(new ArgbEvaluator());
        oba15.setEvaluator(new ArgbEvaluator());
        oba16.setEvaluator(new ArgbEvaluator());
        oba17.setEvaluator(new ArgbEvaluator());
        oba18.setEvaluator(new ArgbEvaluator());
        oba19.setEvaluator(new ArgbEvaluator());
        oba20.setEvaluator(new ArgbEvaluator());

        //oba.setRepeatMode(Animation.REVERSE);
        oba.setRepeatCount(500);
        oba2.setRepeatCount(500);
        oba3.setRepeatCount(500);
        oba4.setRepeatCount(500);
        oba5.setRepeatCount(500);
        oba6.setRepeatCount(500);
        oba7.setRepeatCount(500);
        oba8.setRepeatCount(500);
        oba9.setRepeatCount(500);
        oba10.setRepeatCount(500);
        oba11.setRepeatCount(500);
        oba12.setRepeatCount(500);
        oba13.setRepeatCount(500);
        oba14.setRepeatCount(500);
        oba15.setRepeatCount(500);
        oba16.setRepeatCount(500);
        oba17.setRepeatCount(500);
        oba18.setRepeatCount(500);
        oba19.setRepeatCount(500);
        oba20.setRepeatCount(500);
        oba.start();
        oba2.start();
        oba3.start();
        oba4.start();
        oba5.start();
        oba6.start();
        oba7.start();
        oba8.start();
        oba9.start();
        oba10.start();
        oba11.start();
        oba12.start();
        oba13.start();
        oba14.start();
        oba15.start();
        oba16.start();
        oba17.start();
        oba18.start();
        oba19.start();
        oba20.start();
    }


}
