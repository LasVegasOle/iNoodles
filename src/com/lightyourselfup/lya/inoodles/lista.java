package com.lightyourselfup.lya.inoodles;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

import com.lightyourselfup.lya.inoodles.listas.aroma;
import com.lightyourselfup.lya.inoodles.listas.nota;
import com.lightyourselfup.lya.inoodles.listas.picante;

public class lista extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista2);

        TabHost tabHost = getTabHost();  // The activity TabHost
        TabHost.TabSpec spec;  // Resusable TabSpec for each tab
        Intent intent;  // Reusable Intent for each tab

        // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, aroma.class);

        // Initialize a TabSpec for each tab and add it to the TabHost
        spec = tabHost.newTabSpec("aroma").setIndicator("Aroma").setContent(intent);
        tabHost.addTab(spec);

        // Do the same for the other tabs
        intent = new Intent().setClass(this, nota.class);
        spec = tabHost.newTabSpec("nota").setIndicator("Nota").setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, picante.class);
        spec = tabHost.newTabSpec("picante").setIndicator("Picante").setContent(intent);
        tabHost.addTab(spec);

        tabHost.setCurrentTab(2);
    }
}