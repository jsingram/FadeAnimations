package net.ingramintegrations.fadeanimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    // Create variables for UI
    Button fadeButton;
    RadioButton rdButton;
    ImageView profileImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Load our layout for MainActivity
        setContentView(R.layout.activity_main);

        // Hook our variables to our UI
        fadeButton = (Button) findViewById(R.id.act_main_bt_fade_button);
        rdButton = (RadioButton) findViewById(R.id.act_main_rdb_radioButton);
        // Set the RadioButton to be invisible
        rdButton.setVisibility(View.INVISIBLE);
        profileImage = (ImageView) findViewById(R.id.act_main_imv_imageView);
        // Set the ImageView to be invisible
        profileImage.setVisibility(View.INVISIBLE);

        fadeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Call our animation method and pass in the view we want to apply the animation to
                fadeIn(rdButton);
                fadeIn(profileImage);

            }
        });


    }

    private void fadeIn(View view) {
        // Create an AlphaAnimation variable
        // 0.0f makes the view invisible
        // 1.0f makes the view fully visible
        AlphaAnimation anim = new AlphaAnimation(0.0f, 1.0f);
        // Set out long you want the animation to be. * Measured in milliseconds *
        // 1000 milliseconds = 1 second
        anim.setDuration(1000);
        // Start the animation on our passed in view
        view.startAnimation(anim);
        /*  After the animation is complete we want to make sure we set the visibility of the view
            to VISIBLE. Otherwise it will go back to being INVISIBLE due to our previous lines
            that set the view to INVISIBLE */
        view.setVisibility(View.VISIBLE);
    }
}
