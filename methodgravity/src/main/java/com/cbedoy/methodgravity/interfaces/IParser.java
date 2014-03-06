package com.cbedoy.methodgravity.interfaces;

import org.json.JSONArray;

import java.util.ArrayList;

/**
 * Created by Carlos on 5/03/14.
 */
public interface IParser {
    public ArrayList<IModel> getDataParsed(JSONArray array);
}
