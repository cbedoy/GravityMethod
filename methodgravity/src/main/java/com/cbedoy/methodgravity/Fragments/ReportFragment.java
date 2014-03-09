package com.cbedoy.methodgravity.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.cbedoy.methodgravity.R;
import com.cbedoy.methodgravity.interfaces.IModel;
import com.cbedoy.methodgravity.interfaces.IRefresh;
import com.cbedoy.methodgravity.items.ItemLocationCell;

import java.util.ArrayList;

/**
 * Created by Carlos on 8/03/14.
 */
public  class ReportFragment extends Fragment implements IRefresh {

    private ListView listView;
    public ReportFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.fragment_report, container, false);
        assert rootView != null;
        listView = (ListView)rootView.findViewById(R.id.listFields);
        return rootView;
    }


    @Override
    public void reloadData(ArrayList<IModel> models) {
        listView.setAdapter(new ItemLocationCell(getActivity(), models));
    }
}
