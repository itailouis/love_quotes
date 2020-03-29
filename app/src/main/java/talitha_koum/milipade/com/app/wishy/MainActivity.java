package talitha_koum.milipade.com.app.wishy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView mSplash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        mSplash = (ImageView) findViewById(R.id.SplashImageView);


        Picasso.with(this).load(R.drawable.splash).into(mSplash, new Callback() {
            @Override
            public void onSuccess() {
                // Setup share intent now that image has loaded
                //prepareShareIntent();
                //attachShareIntentAction();
                Thread timer = new Thread() {
                    public void run() {
                        try {
                            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                            mSplash.startAnimation(animation);
                            sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } finally {
                            Intent i = new Intent(MainActivity.this, WishyActivity.class);
                            startActivity(i);
                            finish();
                        }
                    }
                };
                timer.start();
            }

            @Override
            public void onError() {
                Intent i = new Intent(MainActivity.this, WishyActivity.class);
                startActivity(i);
                finish();
            }
        });


    }


}
