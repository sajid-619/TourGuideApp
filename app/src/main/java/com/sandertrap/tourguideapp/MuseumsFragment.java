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
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);

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

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), museums);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
