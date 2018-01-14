package com.example.android.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the facebook icon
        ImageView facebookIcon = findViewById(R.id.facebookIcon);

        // Set a click listener on that View
       facebookIcon.setOnClickListener(new View.OnClickListener() {
            // Open browser to Udacity's Facebook page when icon is clicked on
            @Override
            public void onClick(View view) {
                Uri facebookPage = Uri.parse("http://www.facebook.com/Udacity");
                Intent intent = new Intent(Intent.ACTION_VIEW, facebookPage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        // Find the View that shows the twitter icon
        ImageView twitterIcon = findViewById(R.id.twitterIcon);

        // Set a click listener on that View
        twitterIcon.setOnClickListener(new View.OnClickListener() {
            // Open browser to Udacity's Twitter page when icon is clicked on
            @Override
            public void onClick(View view) {
                Uri twitterPage = Uri.parse("http://twitter.com/udacity?lang=en");
                Intent intent = new Intent(Intent.ACTION_VIEW, twitterPage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        // Find the View that shows the instagram icon
        ImageView instagramIcon = findViewById(R.id.instagramIcon);

        // Set a click listener on that View
        twitterIcon.setOnClickListener(new View.OnClickListener() {
            // Open browser to Udacity's Instagram page when icon is clicked on
            @Override
            public void onClick(View view) {
                Uri twitterPage = Uri.parse("http://www.instagram.com/udacity/");
                Intent intent = new Intent(Intent.ACTION_VIEW, twitterPage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });






    }


}
