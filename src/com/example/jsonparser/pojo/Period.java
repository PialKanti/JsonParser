package com.example.jsonparser.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * @author: Pial Kanti Samadder <pialkanti2012@gmail.com>
 * Date: 3/6/2018
 * Time: 12:18 PM
 */
public class Period {
    @SerializedName("close")
    private CloseTime close;
    @SerializedName("open")
    private OpenTime open;

    public CloseTime getClose() {
        return close;
    }

    public OpenTime getOpen() {
        return open;
    }
}
