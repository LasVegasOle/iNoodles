package com.lightyourselfup.lya.inoodles;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class lista extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista);
    
        final String[] datos =
            new String[]{"PUAAAAAAAAT","Elem2","Elem3","Elem4","Elem5"};
         
        ArrayAdapter<String> adaptador =
            new ArrayAdapter<String>(this, R.layout.list_black_text, R.id.list_content, datos);
         
        ListView lstOpciones = (ListView)findViewById(R.id.LstOpciones);
         
        lstOpciones.setAdapter(adaptador);
    
    }

    
    
}