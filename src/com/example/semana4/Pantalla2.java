package com.example.semana4;

import android.os.Bundle;
import java.text.DecimalFormat;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Pantalla2 extends Activity implements android.view.View.OnClickListener {
	//Estamos declarando los objetos que vamos  a utilizar !!!!
	EditText txtTalla;
	EditText txtPeso;
	Button btnProcesar;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pantalla2);
	txtTalla = (EditText) findViewById(R.id.inputTalla);
	txtPeso =(EditText) findViewById(R.id.inputPeso);
	btnProcesar =(Button) findViewById(R.id.btnProcesar);	
	btnProcesar.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pantalla2, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(v ==btnProcesar)
		{
			double Talla=Double.parseDouble(txtTalla.getText().toString());
			double Peso=Double.parseDouble(txtPeso.getText().toString());
			//peso/(talla*talla)
			double imc=Peso/(Math.pow(Talla, 2));
			DecimalFormat res=new DecimalFormat("###.##");
			Toast.makeText(this, "El Resultado es: "+res.format(imc),
			Toast.LENGTH_SHORT).show();
			if(imc<18.5)
			{
				Toast.makeText(this, "Su estado es Infrapeso",Toast.LENGTH_SHORT).show();
				
			}
			else if ((imc>=18.5)&&(imc<=24.99))
			{
				Toast.makeText(this, "Su estado es Normal",Toast.LENGTH_SHORT).show();
				
			}
			else if ((imc>=25)&&(imc<=29.99))
			{
				Toast.makeText(this, "Su estado es SobrePeso",Toast.LENGTH_SHORT).show();
				
			}
			else
			{
				Toast.makeText(this, "Su estado es Obeso",Toast.LENGTH_SHORT).show();
				
			}
			
			
		}
		
		
	}

	
}
