package com.example.jsonparser.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author: Pial Kanti Samadder <pialkanti2012@gmail.com>
 * Date: 3/6/2018
 * Time: 12:13 PM
 */
public class Restaurant {
    @SerializedName("types")
    private List<String> types;
    @SerializedName("address")
    private String address;
    @SerializedName("name")
    private String name;
    @SerializedName("periods")
    private List<Period> periods;
    @SerializedName("phone_number")
    private String phoneNumber;
    @SerializedName("location")
    private Location location;
    @SerializedName("weekday_text")
    private List<String> weekdayText;
    @SerializedName("url")
    private String url;

    public List<String> getTypes() {
        return types;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public List<Period> getPeriods() {
        return periods;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Location getLocation() {
        return location;
    }

    public List<String> getWeekdayText() {
        return weekdayText;
    }

    public String getUrl() {
        return url;
    }
}
