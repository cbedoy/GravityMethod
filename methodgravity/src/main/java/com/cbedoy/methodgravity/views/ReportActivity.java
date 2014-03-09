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

import com.cbedoy.methodgravity.Fragments.ReportFragment;
import com.cbedoy.methodgravity.R;
import com.cbedoy.methodgravity.interfaces.IModel;
import com.cbedoy.methodgravity.interfaces.IRefresh;
import com.cbedoy.methodgravity.items.ItemFieldElement;
import com.cbedoy.methodgravity.items.ItemLocationCell;
import com.cbedoy.methodgravity.models.LabelFieldModel;
import com.cbedoy.methodgravity.services.ItemLocationService;

import java.util.ArrayList;

public class ReportActivity extends Activity {

    public static ReportActivity mthis;
    public ReportFragment reportFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        reportFragment = new ReportFragment();
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, reportFragment)
                    .commit();
        }
        mthis = this;
        ItemLocationService service = new ItemLocationService(this, "Aguascalientes");
        service.execute();
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




}
