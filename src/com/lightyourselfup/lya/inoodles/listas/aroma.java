package com.lightyourselfup.lya.inoodles.listas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

import com.lightyourselfup.lya.inoodles.R;
import com.lightyourselfup.lya.inoodles.main;
import com.lightyourselfup.lya.inoodles.review;


public class aroma extends Activity{
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista);
    
        final String[] datos =
            new String[]{"Review", "Review", "Main", "Review", "Main"};
         
        ArrayAdapter<String> adaptador =
            new ArrayAdapter<String>(this, R.layout.list_black_text, R.id.list_content, datos);
        
        ListView lstOpciones = (ListView)findViewById(R.id.LstOpciones);
        lstOpciones.setAdapter(adaptador);
    
        // con este al picar un elemento de la lista hacemos algo
        lstOpciones.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                //Acciones necesarias al hacer click
                switch (position){
                
                case 0:
                    Intent intent1 = new Intent();
                    intent1.setClass(aroma.this, review.class);
                    startActivity(intent1);
                    break;
                
                 case 1:
                     Intent intent2 = new Intent();
                     intent2.setClass(getApplicationContext(), review.class);
                     startActivity(intent2);
                     break;

                 case 2:
                     Intent intent3 = new Intent();
                     intent3.setClass(getApplicationContext(), main.class);
                     startActivity(intent3);
                     break;
                     
                 case 3:
                     Intent intent4 = new Intent();
                     intent4.setClass(getApplicationContext(), review.class);
                     startActivity(intent4);
                     break;

                 case 4:
                     Intent intent5 = new Intent();
                     intent5.setClass(getApplicationContext(), main.class);
                     startActivity(intent5);
                     break;
                
                }
            	
            }
        });
    }
}