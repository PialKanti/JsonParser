package com.example.jsonparser.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * @author: Pial Kanti Samadder <pialkanti2012@gmail.com>
 * Date: 3/6/2018
 * Time: 12:15 PM
 */
public class OpenTime {
    @SerializedName("time")
    private String time;
    @SerializedName("day")
    private int dayOfWeek;

    public String getTime() {
        return time;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }
}
