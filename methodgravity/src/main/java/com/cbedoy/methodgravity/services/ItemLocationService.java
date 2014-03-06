package com.cbedoy.methodgravity.services;

import android.app.Activity;
import android.app.Application;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

import com.cbedoy.methodgravity.interfaces.IModel;

/**
 * Created by Carlos on 5/03/14.
 */
public class ItemLocationService extends AsyncTask<String, Integer,String> {

    private ProgressDialog progressDialog;
    private Context context;

    public ItemLocationService(Context context, IModel data){
        this.context = context;
    }

    @Override
    protected void onPreExecute(){
        this.progressDialog = ProgressDialog.show(context, "", "Cargando...");
    }

    @Override
    protected String doInBackground(String... strings) {
        return null;
    }

    @Override
    protected void onPostExecute(String result){
        this.progressDialog.dismiss();
    }
}
