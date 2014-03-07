package com.cbedoy.methodgravity.parsers;

import com.cbedoy.methodgravity.interfaces.IModel;
import com.cbedoy.methodgravity.interfaces.IParser;
import com.cbedoy.methodgravity.models.ResponseModel;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Carlos on 5/03/14.
 */
public class ItemLocationParser implements IParser {

    @Override
    public ArrayList<IModel> getDataParsed(JSONArray array) {
        ArrayList<IModel> data = new ArrayList<IModel>();

        ResponseModel model = new ResponseModel();
        try{
            JSONObject coord = array.getJSONObject(1);
            model.setLatitud((float)coord.getDouble("lat"));
            model.setLongitud((float)coord.getDouble("lon"));


        }catch (Exception e){

        }

        return data;
    }
}
