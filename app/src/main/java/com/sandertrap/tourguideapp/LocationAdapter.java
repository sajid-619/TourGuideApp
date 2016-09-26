package com.sandertrap.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location>{

    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, locations);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Location currentLocation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        // Get the version name from the current Location object and
        // set this text on the name TextView
        nameTextView.setText(currentLocation.getName());

        // Find the TextView in the list_item.xml layout with the ID address
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address);
        // Get the version name from the current Location object and
        // set this text on the address TextView
        addressTextView.setText(currentLocation.getAddress());

        // Find the TextView in the list_item.xml layout with the ID phone_number
        TextView phoneNumberTextView = (TextView) listItemView.findViewById(R.id.phone_number);
        // Get the version name from the current Location object and
        // set this text on the phoneNumber TextView
        phoneNumberTextView.setText(currentLocation.getPhoneNumber());

        // Find the TextView in the list_item.xml layout with the ID website
        TextView websiteTextView = (TextView) listItemView.findViewById(R.id.website);
        // Get the version name from the current Location object and
        // set this text on the name TextView
        websiteTextView.setText(currentLocation.getWebsite());

        // Find the TextView in the list_item.xml layout with the ID website
        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.image);
        // Get the version name from the current Location object and
        // set this text on the name TextView
        linearLayout.setBackgroundResource(currentLocation.getImageResourceId());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
