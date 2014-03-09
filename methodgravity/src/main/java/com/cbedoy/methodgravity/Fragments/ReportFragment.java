package com.cbedoy.methodgravity.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.cbedoy.methodgravity.R;
import com.cbedoy.methodgravity.interfaces.IModel;
import com.cbedoy.methodgravity.interfaces.IRefresh;
import com.cbedoy.methodgravity.items.ItemFieldElement;
import com.cbedoy.methodgravity.items.ItemLocationCell;
import com.cbedoy.methodgravity.models.LabelFieldModel;
import com.cbedoy.methodgravity.models.ResponseModel;

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
        Log.i("Fix", "Reload data");

        ArrayList<IModel> labelFieldModelArrayList = new ArrayList<IModel>();
        ResponseModel responseModel = (ResponseModel) models.get(0);
        labelFieldModelArrayList.add(new LabelFieldModel("Nombre", null, responseModel.getNombre()));
        labelFieldModelArrayList.add(new LabelFieldModel("Country",  null, responseModel.getCountry()));
        labelFieldModelArrayList.add(new LabelFieldModel("Humedad",  null, responseModel.getHumidity()+""));
        labelFieldModelArrayList.add(new LabelFieldModel("Latitud",  null, responseModel.getLatitud()+""));
        labelFieldModelArrayList.add(new LabelFieldModel("Longitud",  null, responseModel.getLongitud()+""));
        labelFieldModelArrayList.add(new LabelFieldModel("Temp act.",  null, responseModel.getTempString()+""));
        labelFieldModelArrayList.add(new LabelFieldModel("Temp Max.",  null, responseModel.getMaxTemp()+""));
        labelFieldModelArrayList.add(new LabelFieldModel("Temp Min.",  null, responseModel.getMinTemp()+""));
        labelFieldModelArrayList.add(new LabelFieldModel("Presion",  null, responseModel.getPressure()+""));
        labelFieldModelArrayList.add(new LabelFieldModel("Sunrise",  null, responseModel.getSunriseString()+""));
        labelFieldModelArrayList.add(new LabelFieldModel("Sunset",  null, responseModel.getSunsetString()+""));

        ItemFieldElement itemFieldElement = new ItemFieldElement(getActivity(), labelFieldModelArrayList);
        listView.setAdapter(itemFieldElement);
        itemFieldElement.notifyDataSetChanged();
    }
}
