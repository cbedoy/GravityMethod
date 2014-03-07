package com.cbedoy.methodgravity.items;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cbedoy.methodgravity.interfaces.IModel;
import com.cbedoy.methodgravity.R;
import com.cbedoy.methodgravity.models.LabelFieldModel;

import java.util.ArrayList;

/**
 * Created by Carlos on 5/03/14.
 */
public class ItemFieldElement extends BaseAdapter {

    private ArrayList<IModel> dataSource;
    private Application context;

    public ItemFieldElement(Application context, ArrayList<IModel> dataSource){
        this.context =      context;
        this.dataSource =   dataSource;
    }

    @Override
    public int getCount() {
        return dataSource.size();
    }

    @Override
    public Object getItem(int i) {
        return dataSource.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null){
            LayoutInflater inflate = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View vistaView  = inflate.inflate(R.layout.inflate_label_field, null);
            view = vistaView;
        }else{
            LinearLayout linearLayout = (LinearLayout)view;
            TextView textView = (TextView)linearLayout.findViewById(R.id.label);
            EditText editText = (EditText)linearLayout.findViewById(R.id.field);
            LabelFieldModel fieldElement = (LabelFieldModel) dataSource.get(i);

            textView.setText(fieldElement.getLabel());
            editText.setText(fieldElement.getValue());
            editText.setHint(fieldElement.getField());
        }



        return view;
    }
}
