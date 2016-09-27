package com.sandertrap.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    Context mContext;

    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantsFragment();
        } else if (position == 1){
            return new MuseumsFragment();
        } else if (position == 2) {
            return new HistoricalSitesFragment();
        } else {
            return new HotelsFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 0:
                return mContext.getString(R.string.restaurants);
            case 1:
                return mContext.getString(R.string.museums);
            case 2:
                return mContext.getString(R.string.historical_sites);
            case 3:
                return mContext.getString(R.string.hotels);
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}