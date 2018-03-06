package com.example.jsonparser.utils;

import com.example.jsonparser.pojo.Restaurant;
import com.google.gson.Gson;
import org.json.JSONObject;

/**
 * @author: Pial Kanti Samadder <pialkanti2012@gmail.com>
 * Date: 3/6/2018
 * Time: 11:58 AM
 */
public class Parser {
    public static Restaurant parseUsingGson(JSONObject jsonObject) {
        Gson gson = new Gson();
        return gson.fromJson(jsonObject.toString(), Restaurant.class);
    }
}
