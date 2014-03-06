package com.cbedoy.methodgravity.parsers;

import com.cbedoy.methodgravity.interfaces.IModel;
import com.cbedoy.methodgravity.interfaces.IParser;

import org.json.JSONArray;

import java.util.ArrayList;

/**
 * Created by Carlos on 5/03/14.
 */
public class ItemLocationParser implements IParser {

    @Override
    public ArrayList<IModel> getDataParsed(JSONArray array) {
        ArrayList<IModel> data = new ArrayList<IModel>();

        return data;
    }
}
