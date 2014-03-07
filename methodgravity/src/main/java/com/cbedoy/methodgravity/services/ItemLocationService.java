package com.cbedoy.methodgravity.services;

import android.app.Activity;
import android.app.Application;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.util.Log;

import com.cbedoy.methodgravity.interfaces.IModel;
import com.cbedoy.methodgravity.interfaces.IService;
import com.cbedoy.methodgravity.libs.CBRESTClient;
import com.cbedoy.methodgravity.models.LocationModel;

import org.json.JSONArray;

/**
 * Created by Carlos on 5/03/14.
 */
public class ItemLocationService extends AsyncTask<String, Integer,String> implements IService{

    private ProgressDialog progressDialog;
    private Context context;
    private String param;
    private  CBRESTClient rest;
    public ItemLocationService(Context context, String param){
        this.context = context;
        this.param = param;
        Log.i("Fix", "Create");
    }

    @Override
    protected void onPreExecute(){
        this.progressDialog = ProgressDialog.show(context, "", "Cargando...");
        Log.i("Fix", "Pre");
    }

    @Override
    protected String doInBackground(String... strings) {

        CBRESTClient rest = new CBRESTClient("http://api.openweathermap.org/data/2.5/weather");

        rest.AddParam("q", param);
        Log.i("Fix", "Do");
        return runSerive(rest);
    }

    @Override
    public String runSerive(CBRESTClient request) {


        try {
            request.Execute(CBRESTClient.RequestMethod.GET);
            Log.i("Fix", "Run");
        } catch (Exception e) {
            e.printStackTrace();
            Log.i("Fix", "Valio pito");

        }

        return request.getResponse();

    }

    //http://api.openweathermap.org/data/2.5/weather?q=Aguascalientes

    @Override
    protected void onPostExecute(String result){
        this.progressDialog.dismiss();
        Log.i("Fix", "Post");
        Log.i("Fix", result);
        try{
            JSONArray jsonArray = new JSONArray(result);

        }catch (Exception e){

        }

    }



}
