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
		//If set, and the activity being launched is already running in the current task, 
		//then instead of launching a new instance of that activity, all of the other activities 
		//on top of it will be closed and this Intent will be delivered to the (now on top) old 
		//activity as a new Intent.
		startActivity(intent);
	}
}