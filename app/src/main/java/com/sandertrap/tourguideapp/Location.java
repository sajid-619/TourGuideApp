package com.sandertrap.tourguideapp;

/**
 * Created by sander_trap on 11-09-16.
 * {@link Location} holds the information about a particluar location.
 */
public class Location {

    /**
     * State variables.
     */
    private String mName;
    private String mAddress;
    private String mPhoneNumber;
    private String mWebsite;
    private int mImageResourceId;

    /**
     * Constructor of the location object.
     *
     * @param name of the location.
     * @param street name of the location.
     * @param zipcode of the location.
     * @param city of the location.
     * @param country of the location.
     * @param phoneNumber of the location.
     * @param website of the location.
     * @param imageResourceId id of the image of the location.
     */
    public Location(String name,
                    String street,
                    String zipcode,
                    String city,
                    String country,
                    String phoneNumber,
                    String website,
                    int imageResourceId) {
        this.mName = name;
        this.mAddress = street + "\n" + zipcode + " " + city + "\n" + country;
        this.mPhoneNumber = phoneNumber;
        this.mWebsite = website;
        this.mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the location.
     *
     * @return name
     **/
    public String getName() {
        return mName;
    }

    /**
     * Get the mAddress of the location.
     *
     * @return mAddress
     */
    public String getAddress() {
        return mAddress;
    }

    /**
     * Get the phone number of the location.
     *
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    /**
     * Get the website of the location.
     *
     * @return website
     */
    public String getWebsite() {
        return mWebsite;
    }

    /**
     * Get the image resource ID.
     *
     * @return imageResourceId
     */
    public int getImageResourceId() { return mImageResourceId; }
}
