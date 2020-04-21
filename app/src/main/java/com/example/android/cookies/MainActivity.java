
package com.example.android.cookies;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }





    public void submitChange( View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.

        ImageView chopLifeImageView = (ImageView) findViewById(R.id.android_cookie_image_view);
        chopLifeImageView.setImageResource(R.drawable.after_cookie);


        // TODO: Find a reference to the TextView in the layout. Change the text.

        TextView consume = (TextView) findViewById(R.id.status_text_view);
        consume.setText("I am soo Filled up");


    }
}