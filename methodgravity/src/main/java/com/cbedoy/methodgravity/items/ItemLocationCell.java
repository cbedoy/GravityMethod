package com.cbedoy.methodgravity.items;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.cbedoy.methodgravity.interfaces.IModel;

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
        return null;
    }
}
