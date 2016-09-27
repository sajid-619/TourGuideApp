package com.sandertrap.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        //Create an array of restaurants
        ArrayList<Location> restaurants = new ArrayList<Location>();

        // Fill the restaurants array with restaurants
        restaurants.add(new Location("Grand Café Restaurant Van Bleiswijk",
                "Westerstraat 84-86",
                "1601 AL",
                "Enkhuizen",
                "Nederland",
                "0228 325 909",
                "http://www.vanbleiswijk.nl",
                R.drawable.van_bleiswijk));
        restaurants.add(new Location("De Mastenbar",
                "Compagnieshaven 3",
                "1601 ZA",
                "Enkhuizen",
                "Nederland",
                "0228 313 691",
                "http://www.demastenbar.nl",
                R.drawable.de_mastenbar));
        restaurants.add(new Location("Stationscafé de haven van Enkhuizen",
                "Stationsplein 2",
                "1601 EN",
                "Enkhuizen",
                "Nederland",
                "0228 312 675",
                "http://www.stationscafe.nl",
                R.drawable.stations_cafe));
        restaurants.add(new Location("Die Port van Cleve",
                "Dijk 74-76",
                "1601 GK",
                "Enkhuizen",
                "Nederland",
                "0228 312 510",
                "http://www.deportvancleve.nl",
                R.drawable.die_port_van_cleve));
        restaurants.add(new Location("Restaurant de Graaf",
                "Havenweg 4",
                "1601 GA",
                "Enkhuizen",
                "Nederland",
                "0228 527 310",
                "http://www.restaurantdegraaf.nl",
                R.drawable.restaurant_de_graaf));

        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), restaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
