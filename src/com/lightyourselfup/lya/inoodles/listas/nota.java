package com.lightyourselfup.lya.inoodles.listas;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class nota extends Activity{
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textview = new TextView(this);
        textview.setText("Nota tab");
        setContentView(textview);
    }

}
