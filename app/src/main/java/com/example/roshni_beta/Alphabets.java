package com.example.roshni_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Alphabets extends AppCompatActivity {
    int count=5;
    Timer time;
    String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    TextView txt,txt2;
    TextView txt3;
    CountDownTimer countDownTimer;
    long timeLeft=60000;
    boolean timeRunning;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);

        txt3=findViewById(R.id.ctd);
        startStop();
        final int N = alphabet.length();
        time = new Timer();
        time.schedule(new TimerTask() {
            @Override
            public void run() {

                Intent login=new Intent(Alphabets.this,End.class);
                startActivity(login);
            }
        },60000);
        Random r = new Random();

        int a=r.nextInt(N);
        final int[] textview_id = {
                R.id.txt1,
                R.id.txt2,
                R.id.txt3,
                R.id.txt4,
                R.id.txt5,
                R.id.txt6,
                R.id.txt7,
                R.id.txt8,
                R.id.txt9,
                R.id.txt10,
                R.id.txt11,
                R.id.txt12,
                R.id.txt13,
                R.id.txt14,
                R.id.txt15,
                R.id.txt16,
                R.id.txt17,
                R.id.txt18,
                R.id.txt19,
                R.id.txt20,

        };

        txt=(TextView)findViewById(R.id.find);
        txt2=(TextView)findViewById(R.id.rm);
        txt.setText(alphabet.charAt(a)+"");
        final String find1=alphabet.charAt(a)+"";
        txt2.setText("5");
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        for (int i = 0; i<14; i++) {
            ((TextView) findViewById(textview_id[i])).setText(alphabet.charAt(r.nextInt(N))+"");
        }
        for (int i = 14; i<20; i++) {
            ((TextView) findViewById(textview_id[i])).setText(alphabet.charAt(a)+"");
        }




        for(int i=0;i<20;i++) {
            final int y=i;
            ((TextView) findViewById(textview_id[i])).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String s = ((TextView) findViewById(textview_id[y])).getText() + "";
                    String sa=find1;
                    if(s.equals(sa+"")){
                        ((TextView) findViewById(textview_id[y])).setText("");
                        count--;
                        if(count==0){
                            Intent login=new Intent(Alphabets.this,End.class);
                            startActivity(login);
                        }
                        String o=Integer.toString(count);
                        txt2.setText(o);
                    }


                }
            });
        }



    }
    void startStop(){
        if(timeRunning){
            stopTimer();
        }

        else{
            startTimer();
        }
    }

    void startTimer(){
        countDownTimer = new CountDownTimer(timeLeft,1000) {
            @Override
            public void onTick(long l) {
                timeLeft=l;
                updateTimer();
            }

            @Override
            public void onFinish() {

            }
        }.start();
        timeRunning=true;
    }

    void stopTimer(){

        countDownTimer.cancel();
        timeRunning=false;
    }

    void updateTimer(){
        int minutes=(int)timeLeft/60000;
        int seconds=(int)timeLeft%60000/1000;
        String timeLeftText;
        timeLeftText="" + minutes;
        timeLeftText+=":";
        if(seconds<10) timeLeftText+="0";
        timeLeftText+=seconds;
        txt3.setText(timeLeftText);
    }
    }

