package com.example.assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class InventoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        // inventory screen heading - personalise to current user
        final TextView textHeading = findViewById(R.id.textInventoryHeading);
        String customHeading = "Hi, " + MainActivity.currentUser.getUsername();
        // set message
        textHeading.setText(customHeading);
        // set color
        int favoriteColor = Color.parseColor(MainActivity.currentUser.getFavoriteColor());
        textHeading.setTextColor(favoriteColor);

        // logout button listener
        final ImageView iconLogOut = findViewById(R.id.iconLogOut);
        iconLogOut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // return to sign in page, clear current user
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}