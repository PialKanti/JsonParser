package com.example.jsonparser;

import com.example.jsonparser.pojo.Restaurant;
import com.example.jsonparser.utils.JsonFileReader;
import com.example.jsonparser.utils.Parser;
import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author: Pial Kanti Samadder <pialkanti2012@gmail.com>
 * Date: 3/6/2018
 * Time: 11:53 AM
 */
public class Main {
    private static final String FILE_NAME = "restaurants-around-me.json";
    private static File file;
    private static InputStream inputStream;

    public static void main(String[] args) {
        try {
            file = new File(FILE_NAME);
            inputStream = new FileInputStream("input/" + file);
            String jsonText = JsonFileReader.readJson(inputStream);
            JSONObject parentObject = new JSONObject(jsonText);
            for (String key : parentObject.keySet()) {
                JSONObject childObject = new JSONObject(parentObject.get(key).toString());
                Restaurant restaurant = Parser.parseUsingGson(childObject);
                System.out.println(restaurant.getName());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
