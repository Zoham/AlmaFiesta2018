package iitbbs.almafiesta;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.VideoView;

public class Splash extends Activity {

    int count=0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.splash);

        final VideoView vid = (VideoView)findViewById(R.id.splashscreen);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.load1);
        vid.setVideoURI(uri);
        vid.start();
        vid.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                new Thread(new Runnable() {
                    @Override
                    public void run()
                    {
                        Intent i = new Intent(Splash.this, MainActivity.class);
                        startActivity(i);
                        finish();
                    }
                }).start();
            }
        });
    }
}
