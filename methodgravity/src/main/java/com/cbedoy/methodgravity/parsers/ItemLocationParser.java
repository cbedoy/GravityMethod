package com.cbedoy.methodgravity.parsers;

import android.util.Log;

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
        Log.i("fix", "start parse");
        ResponseModel model = new ResponseModel();
        try{


            JSONObject json = array.getJSONObject(1);
            model.setLatitud((float)json.getDouble("lat"));
            model.setLongitud((float)json.getDouble("lon"));
            JSONArray jsonA = array.getJSONArray(2);
            model.setCountry(json.getString("country"));
            model.setSunrise(json.getLong("sunrise"));
            model.setSunset(json.getLong("sunset"));
            json = array.getJSONObject(3);

            Log.i("fix", model.getLatitud()+"");
            Log.i("fix", model.getLongitud()+"");
            Log.i("fix", model.getCountry()+"");
            Log.i("fix", model.getSunrise()+"");
            Log.i("fix", model.getSunset()+"");




        }catch (Exception e){
            e.printStackTrace();
        }
        data.add(model);
        Log.i("fix", "End parse");
        return data;
    }
}
