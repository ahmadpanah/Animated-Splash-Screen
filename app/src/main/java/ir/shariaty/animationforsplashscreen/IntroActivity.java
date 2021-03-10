package ir.shariaty.animationforsplashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class IntroActivity extends AppCompatActivity {

    ImageView logo;
    LottieAnimationView hamburger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

       logo = findViewById(R.id.logo);
       hamburger = findViewById(R.id.hamburger);

       logo.animate().translationY(1600).setDuration(1000).setStartDelay(4000);
       hamburger.animate().translationY(1600).setDuration(1000).setStartDelay(4000);
    }
}