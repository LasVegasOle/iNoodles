package com.lightyourselfup.lya.inoodles;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class main extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

	
	public void onReviewClick(View button){
		
		EditText codigoPais = (EditText) findViewById(R.id.codigoPais);
		EditText codigoEmpresa = (EditText) findViewById(R.id.codigoEmpresa);
		EditText codigoArticulo = (EditText) findViewById(R.id.codigoArticulo);
		
		Toast.makeText(this,codigoPais.getText(), Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(); // creas un Intent vacio(new)
		intent.setClass(this, review.class);
		intent.putExtra("codigoPais", codigoPais.getText().toString());
		intent.putExtra("codigoEmpresa", codigoEmpresa.getText().toString());
		intent.putExtra("codigoArticulo", codigoArticulo.getText().toString());
		startActivity(intent);
	}

	public void onListaClick(View button){
		
		EditText codigoPais = (EditText) findViewById(R.id.codigoPais);
		EditText codigoEmpresa = (EditText) findViewById(R.id.codigoEmpresa);
		EditText codigoArticulo = (EditText) findViewById(R.id.codigoArticulo);
		
		Toast.makeText(this,"Listo!", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(); // creas un Intent vacio(new)
		intent.setClass(this, lista.class);
		intent.putExtra("codigoPais", codigoPais.getText().toString());
		intent.putExtra("codigoEmpresa", codigoEmpresa.getText().toString());
		intent.putExtra("codigoArticulo", codigoArticulo.getText().toString());
		startActivity(intent);
	}

}