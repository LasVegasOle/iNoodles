package com.lightyourselfup.lya.inoodles;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class review extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.review);
    }
    
	public void onMainClick(View button){
		
		Intent intent = new Intent(); // creas un Intent vacio(new)
		intent.setClass(this, main.class);
		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		/*Esto lo que hace es no lanzar una nueva Activity main.class si ya hay una por debajo
		ejecutandose. Además cierra todas activities que hubiese abiertas(menos la que la lanza)
		O ESO CREO*/
		startActivity(intent);
	}
}