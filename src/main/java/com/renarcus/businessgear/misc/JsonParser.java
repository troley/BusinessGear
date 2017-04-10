package com.renarcus.businessgear.misc;

import com.google.gson.Gson;

/**
 * Created by Troley on 10-4-2017
 */
public class JsonParser {

    private JsonParser(){}

    private static final Gson gson = new Gson();

    public static Gson getGson() {
        return JsonParser.gson;
    }

}
