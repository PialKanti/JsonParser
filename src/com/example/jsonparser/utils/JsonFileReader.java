package com.example.jsonparser.utils;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author: Pial Kanti Samadder <pialkanti2012@gmail.com>
 * Date: 3/6/2018
 * Time: 12:27 PM
 */
public class JsonFileReader {
    public static String readJson(InputStream inputStream){
        String jsonText = null;
        try {
            int size = inputStream.available();
            byte[] data = new byte[size];
            inputStream.read(data);
            inputStream.close();
            jsonText = new String(data,"UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonText;

    }
}
