package com.cbedoy.methodgravity.items;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cbedoy.methodgravity.R;
import com.cbedoy.methodgravity.interfaces.IModel;
import com.cbedoy.methodgravity.models.LabelFieldModel;
import com.cbedoy.methodgravity.models.LocationModel;

import java.util.ArrayList;

/**
 * Created by Carlos on 6/03/14.
 */
public class ItemLocationCell extends BaseAdapter{

    private ArrayList<IModel> model;
    private Activity activity;
    public ItemLocationCell(Activity activity, ArrayList<IModel> model){
        this.activity = activity;
        this.model = model;
    }

    @Override
    public int getCount() {
        return model.size();
    }

    @Override
    public Object getItem(int i) {
        return model.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null){
            LayoutInflater inflate = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View vistaView  = inflate.inflate(R.layout.inflate_label_field, null);
            view = vistaView;
        }else{
            LinearLayout linearLayout = (LinearLayout)view;
            ImageView imageView = (ImageView)linearLayout.findViewById(R.id.escudo);
            TextView latitud = (TextView)linearLayout.findViewById(R.id.latitud);
            TextView longitud = (TextView)linearLayout.findViewById(R.id.latitud);
            TextView costo = (TextView)linearLayout.findViewById(R.id.latitud);
            TextView nombre = (TextView)linearLayout.findViewById(R.id.ciudad);

            LocationModel locationModel = (LocationModel) model.get(i);
            latitud.setText(locationModel.getLatitud()+"");
            longitud.setText(locationModel.getLongitud()+"");
            costo.setText(locationModel.getCosto()+"");
            nombre.setText(locationModel.getNombre());
            

            linearLayout.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {

                    return false;
                }
            });
        }

        return view;
    }
}
