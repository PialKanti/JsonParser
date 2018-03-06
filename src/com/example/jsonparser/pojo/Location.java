package com.example.jsonparser.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * @author: Pial Kanti Samadder <pialkanti2012@gmail.com>
 * Date: 3/6/2018
 * Time: 12:21 PM
 */
public class Location {
    @SerializedName("lat")
    private double latitude;
    @SerializedName("lng")
    private double longitude;

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
