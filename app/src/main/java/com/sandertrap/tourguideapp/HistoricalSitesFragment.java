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
public class HistoricalSitesFragment extends Fragment {


    public HistoricalSitesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

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

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), historicalSites);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
