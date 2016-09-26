package com.sandertrap.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        //Create an array of historical sites
        ArrayList<Location> museums = new ArrayList<>();

        // Fill the historicalSites array with historical sites
        museums.add(new Location("Zuiderzeemuseum",
                "Wierdijk 12 - 22",
                "1601 LA",
                "Enkhuizen",
                "Nederland",
                "0228 351 111",
                "http://zuiderzeemuseum.nl",
                R.drawable.zuiderzeemuseum));
        museums.add(new Location("Flessenscheepjes Museum",
                "Zuiderspui 1",
                "1601 GH",
                "Enkhuizen",
                "Nederland",
                "0228 317 762",
                "http://www.flessenscheepjesmuseum.nl",
                R.drawable.flessenscheepjesmuseum));
        museums.add(new Location("Enkhuizer Almanak Museum",
                "Havenweg 3",
                "1601 GA",
                "Enkhuizen",
                "Nederland",
                "0228 321 033",
                "http://www.almanak.nl/enkhuizer_almanak_museum/",
                R.drawable.enkhuizer_almanak));

        LocationAdapter itemsAdapter = new LocationAdapter(this, museums);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
