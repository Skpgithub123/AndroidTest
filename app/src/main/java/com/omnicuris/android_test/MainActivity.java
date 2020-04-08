package com.omnicuris.android_test;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView simpleVideoView;
    Boolean canPauseVideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // initiate a video view
        simpleVideoView = (VideoView) findViewById(R.id.simpleVideoView);
        simpleVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.samplevideo));

        simpleVideoView.start();
        // create an object of media controller
        MediaController mediaController = new MediaController(this);
// initiate a video view
        simpleVideoView = (VideoView) findViewById(R.id.simpleVideoView);
// set media controller object for a video view
        simpleVideoView.setMediaController(mediaController);

         canPauseVideo = simpleVideoView.canPause();
    }
}
