package com.sandertrap.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

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

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), hotels);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
