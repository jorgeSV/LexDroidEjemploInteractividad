package com.sovejo.lexdroidejemplointeractividad;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity implements OnClickListener
{
	Button b1,b2,b3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		b1 = (Button) findViewById(R.id.boton1);
		b2 = (Button) findViewById(R.id.boton2);
		b3 = (Button) findViewById(R.id.boton3);
		
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) 
	{
		// TODO Auto-generated method stub
		switch (v.getId()) 
		{
			case R.id.boton1:
				Toast toast1 = Toast.makeText(getApplicationContext(), "Mensaje1", Toast.LENGTH_SHORT);
				toast1.show();
				break;
				
			case R.id.boton2:
				Toast toast2 = Toast.makeText(getApplicationContext(), "Mensaje2", Toast.LENGTH_LONG);
				toast2.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
				toast2.show();
				break;
				
			case R.id.boton3:
				b3.setText("TEEEEE");
				break;
	
			default:
				break;
		}
	}
	
}
