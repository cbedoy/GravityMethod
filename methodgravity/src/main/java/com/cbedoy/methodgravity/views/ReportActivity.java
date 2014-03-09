package com.cbedoy.methodgravity.views;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.ListView;

import com.cbedoy.methodgravity.R;
import com.cbedoy.methodgravity.interfaces.IModel;
import com.cbedoy.methodgravity.items.ItemFieldElement;
import com.cbedoy.methodgravity.models.LabelFieldModel;

import java.util.ArrayList;

public class ReportActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.report, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_report, container, false);
            assert rootView != null;
            ListView listView = (ListView)rootView.findViewById(R.id.listFields);
            ArrayList<IModel> arrayList = new ArrayList<IModel>();

            LabelFieldModel model = new LabelFieldModel();
            model.setField("");
            model.setLabel("Latitud");
            arrayList.add(model);

            model = new LabelFieldModel();
            model.setField("");
            model.setLabel("Longitud");
            arrayList.add(model);

            model = new LabelFieldModel();
            model.setField("");
            model.setLabel("Temperatura");
            arrayList.add(model);

            model = new LabelFieldModel();
            model.setField("");
            model.setLabel("Temp max.");
            arrayList.add(model);

            model = new LabelFieldModel();
            model.setField("");
            model.setLabel("Temp min.");
            arrayList.add(model);

            model = new LabelFieldModel();
            model.setField("");
            model.setLabel("Clima");
            arrayList.add(model);

            model = new LabelFieldModel();
            model.setField("");
            model.setLabel("Humedad");
            arrayList.add(model);

            model = new LabelFieldModel();
            model.setField("");
            model.setLabel("Presion");
            arrayList.add(model);

            model = new LabelFieldModel();
            model.setField("");
            model.setLabel("Amanecer");
            arrayList.add(model);

            model = new LabelFieldModel();
            model.setField("");
            model.setLabel("Anochecer");
            arrayList.add(model);
            listView.setAdapter(new ItemFieldElement(getActivity(), arrayList));
            listView.notif
            return rootView;
        }
    }

}
