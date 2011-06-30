package com.lightyourselfup.lya.inoodles;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class review extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.review);
        
        //escribimos el código de barras
        TextView codigoPais = (TextView) findViewById(R.id.textView1);
        String codigoBarras = getIntent().getStringExtra("codigoPais") + "-" + getIntent().getStringExtra("codigoEmpresa") + "-" + getIntent().getStringExtra("codigoArticulo");
        codigoPais.setText(codigoBarras);
        
        //Actualizamos número de estrellas de las barras de rating
        RatingBar ratingAroma = (RatingBar) findViewById(R.id.ratingAroma);
        ratingAroma.setNumStars(4);
        RatingBar ratingPicante = (RatingBar) findViewById(R.id.ratingPicante);
        ratingPicante.setNumStars(1);
        RatingBar ratingTotal = (RatingBar) findViewById(R.id.ratingTotal);
        ratingTotal.setNumStars(2);
        
        //Abrimos la base de datos 'iNoodles' en modo escritura
        iNoodlesOpenHelper noodlesdbh = new iNoodlesOpenHelper(this, "iNoodles", null, 1);
        SQLiteDatabase db = noodlesdbh.getWritableDatabase();
      //Si hemos abierto correctamente la base de datos
        if(db != null)
        {
                //Insertamos los datos en la tabla Usuarios
                db.execSQL("INSERT INTO iNoodles (nombreNoodles,codigoDeBarras,puntacionTotal) " 
                		+ "VALUES ('Nissin calipo','"+codigoBarras+"', 3);");
                
            //Cerramos la base de datos
            db.close();
        }
       
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