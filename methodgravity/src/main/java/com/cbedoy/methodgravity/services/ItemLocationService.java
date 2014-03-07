package com.cbedoy.methodgravity.services;

import android.app.Activity;
import android.app.Application;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;

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
    private IModel model;
    private  CBRESTClient rest;
    public ItemLocationService(Context context, IModel data){
        this.context = context;
        this.model = model;
    }

    @Override
    protected void onPreExecute(){
        this.progressDialog = ProgressDialog.show(context, "", "Cargando...");
    }

    @Override
    protected String doInBackground(String... strings) {

        CBRESTClient rest = new CBRESTClient("http://api.openweathermap.org/data/2.5/weather");
        LocationModel locationModel = (LocationModel)model;
        rest.AddParam("q",  locationModel.getNombre());
        return runSerive(rest);
    }

    @Override
    public String runSerive(CBRESTClient request) {

        try {
            request.Execute(CBRESTClient.RequestMethod.GET);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (request.getResponse() != null)?request.getResponse():"";

    }

    //http://api.openweathermap.org/data/2.5/weather?q=Aguascalientes

    @Override
    protected void onPostExecute(String result){
        this.progressDialog.dismiss();
        try{
            JSONArray jsonArray = new JSONArray(result);

        }catch (Exception e){

        }

    }



}
