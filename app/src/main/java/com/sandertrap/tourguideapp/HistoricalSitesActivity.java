package com.sandertrap.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricalSitesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        //Create an array of historical sites
        ArrayList<Location> historicalSites = new ArrayList<>();

        // Fill the historicalSites array with historical sites
        historicalSites.add(new Location("Zuiderkerk",
                "Zuiderkerksteeg 1",
                "1601 HJ",
                "Enkhuizen",
                "Nederland",
                "-",
                "http://zuiderkerk-enkhuizen.nl",
                R.drawable.zuiderkerk));
        historicalSites.add(new Location("De Drommedaris",
                "Paktuinen 1",
                "1601 GD",
                "Enkhuizen",
                "Nederland",
                "0228 312 076",
                "http://www.drom.nl",
                R.drawable.drommedaris));
        historicalSites.add(new Location("Oude stadhuis",
                "Breedstraat 53",
                "1601",
                "Enkhuizen",
                "Nederland",
                "0228 360 100",
                "http://www.stadhuiscollectie.nl",
                R.drawable.oude_stadhuis));
        historicalSites.add(new Location("Westerkerk",
                "Westerstraat 138",
                "1601 AN",
                "Enkhuizen",
                "Nederland",
                "0228 317 800",
                "http://www.westerkerkenkhuizen.nl",
                R.drawable.westerkerk));
        historicalSites.add(new Location("De Koepoort",
                "Westeinde 6",
                "1601 BJ",
                "Enkhuizen",
                "Nederland",
                "-",
                "-",
                R.drawable.koepoort));

        LocationAdapter itemsAdapter = new LocationAdapter(this, historicalSites);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
