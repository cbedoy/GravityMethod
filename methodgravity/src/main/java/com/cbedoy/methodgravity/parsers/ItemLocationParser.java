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
    public ArrayList<IModel> getDataParsed(JSONObject jsonObject) {
        ArrayList<IModel> data = new ArrayList<IModel>();
        Log.i("fix", "start parse");
        ResponseModel model = new ResponseModel();
        try{


            JSONObject coord = jsonObject.getJSONObject("coord");
            model.setLatitud((float)coord.getDouble("lat"));
            model.setLongitud((float)coord.getDouble("lon"));

            JSONObject sys = jsonObject.getJSONObject("sys");
            model.setMesssage(sys.getString("message"));
            model.setCountry(sys.getString("country"));
            model.setSunrise(Integer.parseInt(sys.getString("sunrise")));
            model.setSunset(Integer.parseInt(sys.getString("sunset")));

            JSONObject main = jsonObject.getJSONObject("main");
            model.setTemp(Float.parseFloat(main.getString("temp")));
            model.setPressure(Float.parseFloat(main.getString("pressure")));
            model.setHumidity(Float.parseFloat(main.getString("humidity")));
            model.setMaxTemp(Float.parseFloat(main.getString("temp_max")));
            model.setMinTemp(Float.parseFloat(main.getString("temp_min")));

            model.setId(Integer.parseInt(jsonObject.getString("id")));
            model.setNombre(jsonObject.getString("name"));





            Log.i("fix", model.getLatitud() + "");
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
