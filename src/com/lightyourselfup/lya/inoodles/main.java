package com.lightyourselfup.lya.inoodles;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class main extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
	public void onReviewClick(View button){
		
		Intent intent = new Intent(); // creas un Intent vacio(new)
		intent.setClass(this, review.class);
		startActivity(intent);
	}
}