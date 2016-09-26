package com.sandertrap.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the view that shows the catagory
        TextView restaurants = (TextView) findViewById(R.id.restaurants);
        TextView hotels = (TextView) findViewById(R.id.hotels);
        TextView museums = (TextView) findViewById(R.id.museums);
        TextView historical_sites = (TextView) findViewById(R.id.historical_sites);

        //Set the OnClickListener on the restaurant view.
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link RestaurantsActivity}
                Intent i = new Intent(getApplicationContext(), RestaurantsActivity.class);
                //Start the new activity
                startActivity(i);
            }
        });

        //Set the OnClickListener on the hotels view.
        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link HotelsActivity}
                Intent i = new Intent(getApplicationContext(), HotelsActivity.class);
                //Start the new activity
                startActivity(i);
            }
        });

        //Set the OnClickListener on the museums view.
        museums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link MuseumsActivity}
                Intent i = new Intent(getApplicationContext(), MuseumsActivity.class);
                //Start the new activity
                startActivity(i);
            }
        });

        //Set the OnClickListener on the historical sites view.
        historical_sites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link HistoricalSitesActivity}
                Intent i = new Intent(getApplicationContext(), HistoricalSitesActivity.class);
                //Start the new activity
                startActivity(i);
            }
        });
    }
}
