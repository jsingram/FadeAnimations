package net.ingramintegrations.fadeanimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    Button fadeButton;
    RadioButton rdButton;
    ImageView profileImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fadeButton = (Button) findViewById(R.id.act_main_bt_fade_button);
        rdButton = (RadioButton) findViewById(R.id.act_main_rdb_radioButton);
        rdButton.setVisibility(View.INVISIBLE);
        profileImage = (ImageView) findViewById(R.id.act_main_imv_imageView);
        profileImage.setVisibility(View.INVISIBLE);

        fadeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fadeIn(rdButton);
                fadeIn(profileImage);

            }
        });


    }

    private void fadeIn(View view) {
        AlphaAnimation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(1000);
        view.startAnimation(anim);
        view.setVisibility(View.VISIBLE);
    }
}
