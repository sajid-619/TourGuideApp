package com.sandertrap.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        //Create an array of historical sites
        ArrayList<Location> hotels = new ArrayList<>();

        // Fill the historicalSites array with historical sites
        hotels.add(new Location("De Koepoort",
                "Westerstraat 294",
                "1601 AS",
                "Enkhuizen",
                "Nederland",
                "0228 314 966",
                "http://www.hoteldekoepoort.com",
                R.drawable.hotel_koepoort));
        hotels.add(new Location("Hotel du passage",
                "Paktuinen 8",
                "1601 GD",
                "Enkhuizen",
                "Nederland",
                "0228 312 462",
                "http://www.hoteldupassage.nl",
                R.drawable.hotel_du_passage));
        hotels.add(new Location("Die Port van Cleve",
                "Dijk 74-76",
                "1601 GK",
                "Enkhuizen",
                "Nederland",
                "0228 312 510",
                "http://www.deportvancleve.nl",
                R.drawable.die_port_van_cleve));
        hotels.add(new Location("SuyderSee Hotel",
                "Koltermanstraat 7",
                "1601 AN",
                "Enkhuizen",
                "Nederland",
                "0228 316 381",
                "http://www.suyderseehotel.nl/en/",
                R.drawable.suydersee_hotel));
        hotels.add(new Location("Het Wapen van Enkhuizen",
                "Breedstraat 59",
                "1601 KB",
                "Enkhuizen",
                "Nederland",
                "0228 324 257",
                "http://hetwapenvanenkhuizen.nl",
                R.drawable.wapen_van_enkhuizen));

        LocationAdapter itemsAdapter = new LocationAdapter(this, hotels);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
