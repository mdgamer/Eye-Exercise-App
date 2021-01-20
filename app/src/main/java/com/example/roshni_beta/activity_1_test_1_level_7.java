package com.example.roshni_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class activity_1_test_1_level_7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_test_1_level_7);

        VideoView simpleVideoView = (VideoView) findViewById(R.id.vid2); // initiate a video view
        simpleVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.vid7));



        simpleVideoView.start();
    }
}
